/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import static assign.Assign.*;
import static assign.click.alledge;
import static assign.click.allvertex;
import static assign.click.*;
import java.awt.Point;

/**
 *
 * @author kaun_meet
 */
public class point {

//    String from, to;
//    int weight;
//
//    point(String a, String b, int c) {
//        this.from = a;
//        this.to = b;
//        this.weight = c;
//    }
//    public static int cnames(String a,String b){
//        
//    } 
//    
    public static int validnames(String a, String b) {
        int valid = 1;
        int i = 0;
        try {
            for (i = 0; i < alledge.size(); i++) {
                if (alledge.get(i).fromvertex.equals(a) && alledge.get(i).tovertex.equals(b)) {
                    valid = -1;
                    break;
                }
            }
        } catch (Exception e) {
//                Exception e;
        }
        return valid;
    }

    public static int validw(int a) {
        int n = 5;
        try {
//             n = Integer.parseInt(a);
            n = a;
//            return 1;

        } catch (Exception e) {
            return -1;
        }
        if (n <= 0) {
            return -2;
        }
        return 1;
    }

    public static void addedge(String a, String b, int c) {
        try {
            System.out.println("Adding edge" + " " + a + b + c);
//        point temp = new point(a, b, c);
            alledge.add(new saareedge(a, b, c));
            int m = -1;
            for (int i = 0; i < allvertex.size(); i++) {
                if (allvertex.get(i).namevertex.equals(b)) {
                    firstofedge.add(new Point(allvertex.get(i).xcoor, allvertex.get(i).ycoor));
                    break;
                }
            }
            for (int i = 0; i < allvertex.size(); i++) {
                if (allvertex.get(i).namevertex.equals(c)) {
                    lastofedge.add(new Point(allvertex.get(i).xcoor, allvertex.get(i).ycoor));
                    break;
                }
            }
        } catch (Exception e) {
        }
//        firstofedge.add(a);
//        lastofedge.add(b);
    }

    public static int checkedge(String a, String b) {
        try {
            int i = 0;
            int f = -1;
            for (i = 0; i < alledge.size(); i++) {
                if (alledge.get(i).fromvertex.equals(a) && alledge.get(i).tovertex.equals(b)) {
                    f = i;
                    break;
                }
            }
            return f;
        } catch (Exception e) {
            return 0;
        }
    }

}
