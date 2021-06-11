/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

public class Node {
   /*
    a) left b merupakan predesor dari a dan c, right f merupakan predesor dari e dan g.
       d merupakan predesesor b dan f
    b) left a dan c merupakan succesor dari b, right e dan g merupakan succesor dari f.
       b dan f merupakan succesor dari d
    c) left d dan b merupakan ancestor dari a atau c, right d dan f merupakan ancestor dari e atau g
    d) left a dan b merupakan descendent dari d, c dan b merupakan descendent dari d. right g dan f merupakan descendent dari d, e dan f merupakan descendent dari d
    e) left b merupakan parent dari a atau c, right f merupakan parent dari e atau g
    f) left c atau a merupakan child dari b, right e atau g merupakan child dari d
    g) left a dan c adalah sibling, right e dan g adalah sibling
    h) subtree b,c,a dan subtree f,e,g
    */
    char data;
    Node left;
    Node right;
    public Node(char data){
        this.data = data;
    }
}
