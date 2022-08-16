package com.guozr.demo.util;

import java.awt.geom.Point2D;
import java.util.List;

/**
 * 电子围栏
 * @author guozr
 * @date 2022/6/23 10:09
 */
public class ElectronicFence {
    /**
     * 地球半径
     */
    private static double EARTH_RADIUS = 6378138.0;

    private static double rad(double d){
        return d * Math.PI / 180.0;
    }

    /**
     * 计算是否在圆上(单位/千米)
     * @param radius	半径
     * @param lat1		维度
     * @param lng1		经度
     * @return
     */
    public static boolean isInCircle(double radius, double lat1, double lng1, double lat2, double lng2){

        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(
                Math.sin(a/2), 2) +
                Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        if(s > radius){//不在圆上
            return false;
        }else{
            return true;
        }
    }

    /**
     * 判断是否在矩形范围内
     * @param lat		测试点纬度
     * @param lng		测试点经度
     * @param minLat	纬度范围限制1
     * @param maxLat	纬度范围限制2
     * @param minLng	经度范围限制1
     * @param maxLng	经度范围限制2
     * @return
     */
    public static boolean isInRectangleArea(double lat, double lng, double minLat, double maxLat, double minLng, double maxLng){

        if(isInRange(lat, minLat, maxLat)){//如果在维度范围内
            if(minLng*maxLng>0){
                if(isInRange(lng, minLng, maxLng)){
                    return true;
                }else{
                    return false;
                }
            }else{
                if(Math.abs(minLng)+Math.abs(maxLng)<180){
                    if(isInRange(lng, minLng, maxLng)){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    double left = Math.max(minLng, maxLng);
                    double right = Math.min(minLng, maxLng);
                    if(isInRange(lng, left, 180) || isInRange(lng, right, -180)){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
    }

    /**
     * 判断是否在经纬度范围内
     * @param point
     * @param left
     * @param right
     * @return boolean
     */
    public static boolean isInRange(double point, double left, double right) {
        return point >= Math.min(left, right) && point <= Math.max(left, right);
    }

    /**
     * 判断点是否在多边形内
     * @param polygon	多边形
     * @param point		检测点
     * @return			点在多边形内返回true，否则返回false
     */
    public static boolean IsPtInPoly(List<Point2D.Double> polygon, Point2D.Double point){

        int N = polygon.size();
        //如果点位于多边形的顶点或边上，也算做点在多边形内，直接返回true
        boolean boundOrVertex = true;
        //cross points count of x--交叉点计数X
        int intersectCount = 0;
        //浮点类型计算时候与0比较时候的容差
        double precision = 2e-10;
        //neighbour bound vertices--临近绑定顶点
        Point2D.Double p1, p2;
        //当前点
        Point2D.Double p = point;
        //left vertex--左顶点
        p1 = polygon.get(0);
        //check all rays--检查所有射线
        for (int i = 1; i <= N; ++i) {
            if(p.equals(p1)) {
                //p is an vertex--p是一个顶点
                return boundOrVertex;
            }
            //right vertex--右顶点
            p2 = polygon.get(i % N);
            //ray is outside of our interests--射线不在我们的兴趣范围之内
            if(p.x < Math.min(p1.x, p2.x) || p.x > Math.max(p1.x, p2.x)){
                p1 = p2;
                //next ray left point--下一条射线的左边点
                continue;
            }
            //ray is crossing over by the algorithm(common part of)--射线被算法穿越(常见的一部分)
            if(p.x > Math.min(p1.x, p2.x) && p.x < Math.max(p1.x, p2.x)){
                //x is before of ray--x在射线之前
                if(p.y <= Math.max(p1.y, p2.y)){
                    //overlies on a horizontal ray--在一条水平射线上
                    if(p1.x == p2.x && p.y >= Math.min(p1.y, p2.y)){
                        return boundOrVertex;
                    }
                    //ray is vertical--射线是垂直的
                    if(p1.y == p2.y){
                        //overlies on a vertical ray--覆盖在垂直光线上
                        if(p1.y == p.y){
                            return boundOrVertex;
                        }else{//before ray--射线之前
                            ++intersectCount;
                        }

                    }else{
                        //cross point on the left side--左边的交叉点
                        //cross point of y--y的交叉点
                        double xinters = (p.x - p1.x) * (p2.y - p1.y) / (p2.x - p1.x) + p1.y;
                        //overlies on a ray--覆盖在射线
                        if(Math.abs(p.y - xinters) < precision){
                            return boundOrVertex;
                        }
                        //before ray--射线之前
                        if(p.y < xinters){
                            ++intersectCount;
                        }
                    }
                }
            }else{
                //special case when ray is crossing through the vertex--特殊情况下，当射线穿过顶点
                //p crossing over p2--p交叉p2
                if(p.x == p2.x && p.y <= p2.y){
                    //next vertex--下一个顶点
                    Point2D.Double p3 = polygon.get((i+1) % N);
                    //p.x lies between p1.x & p3.x--p.x在p1.x和p3.x之间
                    if(p.x >= Math.min(p1.x, p3.x) && p.x <=Math.max(p1.x, p3.x)){
                        ++intersectCount;
                    }else{
                        intersectCount +=  2;
                    }
                }
            }
            //next ray left point--下一条射线的左边点
            p1 = p2;
        }
        //偶数在多边形外
        if(intersectCount % 2 == 0){
            //奇数在多边形内
            return false;
        }else{
            return true;
        }
    }
}
