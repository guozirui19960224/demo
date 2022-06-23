package com.guozr.demo.code;

import com.google.ortools.Loader;
import com.google.ortools.sat.*;

import static java.util.Arrays.stream;

/**
 * 作业时长算法demo
 * @author guozr
 * @date 2022/5/17 10:42
 */
public class OrtoolsForTime {

    public static void main(String[] args) {
        Loader.loadNativeLibraries();
        // 数据模型
        CpModel model = new CpModel();

        // 变量
        int varUpperBound = stream(new int[] {11, 14, 13, 10}).max().getAsInt();

        IntVar x = model.newIntVar(0, varUpperBound, "x");//5
        IntVar y = model.newIntVar(0, varUpperBound, "y");//3
        IntVar z = model.newIntVar(0, varUpperBound, "z");//2
        IntVar a = model.newIntVar(0, varUpperBound, "a");//1

        // 线性约束
        model.addEquality(LinearExpr.weightedSum(new IntVar[] {x, y, z, a}, new long[] {1,1,1,1}), 11);
        model.addEquality(LinearExpr.weightedSum(new IntVar[] {x, y, z, a}, new long[] {1,2,1,1}), 14);
        model.addEquality(LinearExpr.weightedSum(new IntVar[] {x, y, z, a}, new long[] {1,1,2,1}), 13);
        model.addEquality(LinearExpr.weightedSum(new IntVar[] {x, y, z}, new long[] {1,1,1}), 10);

        model.maximize(LinearExpr.weightedSum(new IntVar[] {x, y, z}, new long[] {2, 2, 3}));

        // Create a solver and solve the model.
        CpSolver solver = new CpSolver();
        CpSolverStatus status = solver.solve(model);

        if (status == CpSolverStatus.OPTIMAL || status == CpSolverStatus.FEASIBLE) {
            System.out.printf("Maximum of objective function: %f%n", solver.objectiveValue());
            System.out.println("x = " + solver.value(x));
            System.out.println("y = " + solver.value(y));
            System.out.println("z = " + solver.value(z));
            System.out.println("a = " + solver.value(a));
        } else {
            System.out.println("No solution found.");
        }

        // Statistics.
        System.out.println("Statistics");
        System.out.printf("  conflicts: %d%n", solver.numConflicts());
        System.out.printf("  branches : %d%n", solver.numBranches());
        System.out.printf("  wall time: %f s%n", solver.wallTime());
    }

}
