package com.learn.coding.collections.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class Point {
    int x;
    int y;
    int d;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }
}

class PointDistComparator implements Comparator<Point>{
    public int compare(Point p1, Point p2){
        if(p1.d < p2.d) return 1;
        else if(p1.d > p2.d) return -1;
        else return 0;
    }


}

public class PriorityQueueMain {
    public static void main(String[] args) {

        PriorityQueue<Point> pq = new PriorityQueue<>(10, new PointDistComparator());
    }
}
