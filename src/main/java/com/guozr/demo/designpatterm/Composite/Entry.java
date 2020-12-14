package com.guozr.demo.designpatterm.Composite;

/**
 * @ClassName Entry
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 18:01
 **/
public abstract class Entry {
    protected Entry parent;

    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() +")";
    }

    public String getFullName(){
        StringBuffer fullname = new StringBuffer();
        Entry entry = this;
        do {
            fullname.insert(0,"/" + entry.getName());
            entry = entry.parent;
        }while (entry != null);
        return fullname.toString();
    }
}
