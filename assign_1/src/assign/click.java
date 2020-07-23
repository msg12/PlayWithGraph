/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import java.lang.Math;
import java.awt.*;
import static assign.thr.*;

import assign.Assign.*;
import static assign.interaction.xxx;
import static assign.interaction.yyy;
import java.awt.geom.Line2D;
import static java.lang.Thread.sleep;

import java.util.*;
import static assign.pathdisplay.*;

import javax.swing.*;

/**
 *
 * @author kaun_meet
 */
//import javax.swing.JPanel;
class saarevertex {

    String namevertex;
    int xcoor;
    int ycoor;

    saarevertex(String namevertex, int xcoor, int ycoor) {
        this.namevertex = namevertex;
        this.xcoor = xcoor;
        this.ycoor = ycoor;
    }

}

class saareedge {

    String fromvertex;
    String tovertex;
    int weightedge;

    saareedge(String fromvertex, String tovertex, int weightedge) {
        this.fromvertex = fromvertex;
        this.tovertex = tovertex;
        this.weightedge = weightedge;
    }
}

public class click extends JPanel {

    static ArrayList<String> namepts = new ArrayList<String>();
    static ArrayList<Point> pts = new ArrayList<Point>();

    static ArrayList<saarevertex> allvertex = new ArrayList<saarevertex>();

    static ArrayList<Point> firstofedge = new ArrayList<Point>();
    static ArrayList<Point> lastofedge = new ArrayList<Point>();
    static ArrayList<Integer> weigh = new ArrayList<Integer>();

    static ArrayList<saareedge> alledge = new ArrayList<saareedge>();

    public static void add_ver(String n, int gh, int hh) {
        String a = Integer.toString(gh);
        String b = Integer.toString(hh);
        a = a + b;
        namepts.add(n);

        Point temp = new Point(gh, hh);
        pts.add(temp);
        allvertex.add(new saarevertex(n, gh, hh));

    }

    click() {
        System.out.println("bhai");
    }
//    static int x = 100;
//    static int y = 100;

//    public static void circle(int x, int y) {
//        click.x = x;
//        click.y = y;
//        paintComponent(this);
//    }
//    public static void channge(int mark,int val){
//        int x=firstofedge.get(mark).x;
//        
//        
//        weigh.get(mark)=val;
//        
//    }
    
    
    static int count=0;
    
//static ArrayList<Point> animate1 = new ArrayList<Point>();
//static ArrayList<Point> animate2 = new ArrayList<Point>();
//static ArrayList<Point> animate3 = new ArrayList<Point>();
//static ArrayList<Point> animate4 = new ArrayList<Point>();
//static ArrayList<Point> animate5 = new ArrayList<Point>();

    public void paintComponent(Graphics g) {
        try {

            super.paintComponent(g);

            Graphics2D g1 = (Graphics2D) g;

            g1.setColor(Color.yellow);
            int i;
//        for(i=0;i<vertexlist.size();i++){
            int xx = 100;
//        =(Integer.parseInt(vertexlist.get(i).xcoordinate));
            int yy = 100;
//           System.out.println("size"+pts.size());
            int siw = pathdisplay.pathh.size();
            int j;
            Graphics2D g2 = (Graphics2D) g;

            for (i = 0; i < firstofedge.size(); i++) {
                g2.setStroke(new BasicStroke(5));
                g2.setColor(Color.yellow);
                if (pathdisplay.ans.contains(i)) {
//                    System.out.println("orange" + i);
//                    g/2.setColor(Color.yellow);
//                    g2.setStroke(new BasicStroke(5));
//                    Line2D lin = new Line2D.Float(firstofedge.get(i).x, firstofedge.get(i).y, lastofedge.get(i).x, lastofedge.get(i).y);
//                    g2.draw(lin);
//                    continue;

                }

//            super.paint(g);
//            System.out.println(firstofedge.get(i).x+" "+ firstofedge.get(i).y+" "+ lastofedge.get(i).x+" "+ lastofedge.get(i).y);
                int x1 = firstofedge.get(i).x;
                int y1 = firstofedge.get(i).y;
                int x2 = lastofedge.get(i).x;
                int y2 = lastofedge.get(i).y;
                Line2D lin = new Line2D.Float(firstofedge.get(i).x, firstofedge.get(i).y, lastofedge.get(i).x, lastofedge.get(i).y);
                g2.draw(lin);
            }
            for (i = 0; i < firstofedge.size(); i++) {
                int x1 = firstofedge.get(i).x;
                int y1 = firstofedge.get(i).y;
                int x2 = lastofedge.get(i).x;
                int y2 = lastofedge.get(i).y;
                float mid1 = (float) (x1 + x2 + x1) / 3;
                float mid2 = (float) (y1 + y2 + y1) / 3;
//g2.drawString(aci, TOP_ALIGNMENT, TOP_ALIGNMENT);
//g2.setColor(Color.yellow);

                g2.setColor(Color.red);
//            Color.red
                g2.setStroke(new BasicStroke(5));
//            g2.setStroke(0x8);
                g2.drawString(Integer.toString(weigh.get(i)), mid1, mid2 - 10);

                g2.setStroke(new BasicStroke(10));
                g2.setColor(Color.GREEN);
                int jh = 0;
                int kh = 0;
                int per = y2 - y1;
                int base = x2 - x1;
                double hyp = (double) (per * per);
                hyp += (double) (base * base);

                hyp = Math.sqrt(hyp);
                int finall = (int) hyp;

                int tot = ((y2 - y1) * (y2 - y1)) + ((x2 - x1) * (x2 - x1));

                double tt = (double) tot;
                double roo = Math.sqrt(tt);

                int ro = (int) roo;

//            ro = ro - 15;
                ro = 150;

                jh = (ro * x2) + (15 * x1);
                jh = jh / (ro + 15);
                kh = (ro * y2) + (15 * y1);
                kh = kh / (ro + 15);

//            
//           jh= ((finall*x2)-(30*base))/finall;
//           kh=  ((finall*x2)-(30*per))/finall;
//            g2.drawString("*", jh + 5, kh + 5);
//             g2.drawString("*",50,50);
            }
            
            
            
            for(int hh=0;hh<countt;hh++){
            
         
                int currx, curry;
                currx = xxx[hh];
                curry = yyy[hh];

                if (choice[hh] == 5) {

                    g2.drawLine(currx, curry, currx + 3, curry);
                    g2.drawLine(currx, curry, currx, curry + 3);
                    g2.drawLine(currx + 3, curry, currx + 3, curry + 3);
                    g2.drawLine(currx, curry + 3, currx + 3, curry + 3);

//                g2.draw();
                } 
                if (choice[hh]==2) {
//                g2.drawLine(currx, curry, currx, curry + 6);
//                g2.drawLine(currx - 3, curry + 3, currx + 3, curry + 3);

                    g2.setStroke(new BasicStroke(3));
                    Line2D li = new Line2D.Float(currx, curry, currx, curry + 6);
                    g2.draw(li);
                    Line2D lin = new Line2D.Float(currx - 3, curry + 3, currx + 3, curry + 3);
                    g2.draw(lin);

                } 
                 if (choice[hh]==3) {
                    g2.setStroke(new BasicStroke(3));
                    Line2D li = new Line2D.Float(currx, curry, currx + 6, curry + 6);
                    g2.draw(li);
                    Line2D lin = new Line2D.Float(currx, curry + 6, currx + 6, curry);
                    g2.draw(lin);

                } 
                 if (choice[hh] == 4) {

                    currx += 3;
                    curry += 3;

                    curry -= 2;

                    g2.setStroke(new BasicStroke(3));
                    Line2D li = new Line2D.Float(currx - 3, curry + 5, currx, curry);
                    g2.draw(li);
                    Line2D lin = new Line2D.Float(currx + 3, curry + 5, currx, curry);
                    g2.draw(lin);

//                 g2.setStroke(new BasicStroke(3));
                    Line2D lii = new Line2D.Float(currx + 3, curry + 5, currx - 3, curry + 5);
                    g2.draw(lii);

                } 
                 else       {
                    g2.setStroke(new BasicStroke(5));
                    g2.fillOval(finx - 3, finy - 3, 6, 6);
                }
            
            
            
            
            }      
//            if (finx2 != -1 || finy2 != -1) {
//                int currx, curry;
//                currx = finx2 - 3;
//                curry = finy2 - 3;
//
//                if (squaree[1] == 1) {
//
//                    g2.drawLine(currx, curry, currx + 3, curry);
//                    g2.drawLine(currx, curry, currx, curry + 3);
//                    g2.drawLine(currx + 3, curry, currx + 3, curry + 3);
//                    g2.drawLine(currx, curry + 3, currx + 3, curry + 3);
//
////                g2.draw();
//                } 
//                if (pluss [1]== 1) {
////                g2.drawLine(currx, curry, currx, curry + 6);
////                g2.drawLine(currx - 3, curry + 3, currx + 3, curry + 3);
//
//                    g2.setStroke(new BasicStroke(3));
//                    Line2D li = new Line2D.Float(currx, curry, currx, curry + 6);
//                    g2.draw(li);
//                    Line2D lin = new Line2D.Float(currx - 3, curry + 3, currx + 3, curry + 3);
//                    g2.draw(lin);
//
//                } 
//                 if (crosss [1]== 1) {
//                    g2.setStroke(new BasicStroke(3));
//                    Line2D li = new Line2D.Float(currx, curry, currx + 6, curry + 6);
//                    g2.draw(li);
//                    Line2D lin = new Line2D.Float(currx, curry + 6, currx + 6, curry);
//                    g2.draw(lin);
//
//                } 
//                 if (trianglee[1] == 1) {
//
//                    currx += 3;
//                    curry += 3;
//
//                    curry -= 2;
//
//                    g2.setStroke(new BasicStroke(3));
//                    Line2D li = new Line2D.Float(currx - 3, curry + 5, currx, curry);
//                    g2.draw(li);
//                    Line2D lin = new Line2D.Float(currx + 3, curry + 5, currx, curry);
//                    g2.draw(lin);
//
////                 g2.setStroke(new BasicStroke(3));
//                    Line2D lii = new Line2D.Float(currx + 3, curry + 5, currx - 3, curry + 5);
//                    g2.draw(lii);
//
//                } else {
//                    g2.setStroke(new BasicStroke(5));
//                    g2.fillOval(finx - 3, finy - 3, 6, 6);
//                }
//            }
//            
//            
            
            
            
            
            
            int ii = -1;
            for (Point pp : pts) {
                ii++;
                g1.setColor(Color.pink);
                g1.setStroke(new BasicStroke(2));
                g1.drawOval(pp.x - 18, pp.y - 18, 36, 36);
                g1.setColor(Color.yellow);
                g1.fillOval(pp.x - 15, pp.y - 15, 30, 30);

                g1.setColor(Color.BLACK);
                g1.setStroke(new BasicStroke(5));
//            g2.setStroke(0x8);
                g1.drawString(namepts.get(ii), pp.x - 10, pp.y + 5);

            }

//        f
            for (i = 0; i < firstofedge.size(); i++) {
                int x1 = firstofedge.get(i).x;
                int y1 = firstofedge.get(i).y;
                int x2 = lastofedge.get(i).x;
                int y2 = lastofedge.get(i).y;
                float mid1 = (float) (x1 + 9 * x2 + x1) / 11;
                float mid2 = (float) (y1 + 9 * y2 + y1) / 11;

                g2.setStroke(new BasicStroke(10));
                g2.setColor(Color.GREEN);
                int jh = (int) mid1;
                int kh = (int) mid2;

                g2.drawString("*", jh, kh);

//       int i;
            }

//        }
//        g.fillOval(WIDTH, WIDTH, WIDTH, WIDTH);
        } catch (Exception e) {
        }

    }

//    public static void main(String[] args) {
//
//    }
}
