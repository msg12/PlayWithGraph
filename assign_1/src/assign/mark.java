/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import static assign.Assign.*;
import static assign.click.allvertex;
import static assign.click.namepts;
import static assign.click.pts;
import java.awt.Point;

/**
 *
 * @author kaun_meet
 */
public class mark {

//    String nameofvertex;
//    int xcoordinate;
//    int ycoordinate;
//    mark(String a, int b, int c) {
//        nameofvertex = a;
//        xcoordinate = b;
//        ycoordinate = c;
//    }
//
    public static int cnof(String a) {
        try {
            int i = 0;
            int valid = 1;
            for (i = 0; i < namepts.size(); i++) {
                if (a.equals(namepts.get(i))) {
                    valid = -1;
                    break;
                }
            }
            return valid;
        } catch (Exception e) {
            return 0;
        }

    }

    public static int ccor(int b, int c) {
        int i = 0;
        int valid = 1;
        try {
            for (i = 0; i < pts.size(); i++) {

                int xx = pts.get(i).x;
                int yy = pts.get(i).y;
                if (((b - xx) * (b - xx) + ((c - yy) * (c - yy))) <= 3600) {
                    valid = -1;
                    break;
                }
            }
        } catch (Exception e) {
        }
        if (valid == -1) {
            return valid;
        }

        try {
            int gh = b;
            int bh = c;

        } catch (Exception e) {
            return -2;
        }
        return valid;
    }

    public static void addvertex(String n, int i, int j) {
        System.out.println("adding" + n + i + j);
//        mark temp = new mark(n, i, j);
        pts.add(new Point(i, j));
//        vertexlist.add(temp);
        namepts.add(n);
        allvertex.add(new saarevertex(n, i, j));

    }

    public static int checkvertex(String a) {
        try {
            System.out.println("checking " + a);
            int i = 0;
            int n = namepts.size();
            int f = -1;
            for (i = 0; i < n; i++) {
//            System.out.println(vertexlist.get(i));
                if (namepts.get(i).equals(a)) {
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
