/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.awt.Color;
import Model.Sel;
import Model.Tempat;
import View.GameFrame;
import View.TempatPanel;
/**
 *
 * @author admin
 */
public class TestGame2 {
    public static void main(String[] args) {
        // buat 1 sel
        Sel sel = new Sel(0, 1,20,20, '@', Color.RED);
        // buat 1 sel
        Sel sel2 = new Sel(2, 1,20,20, '#', Color.RED);
        // buat 1 tempat dan tambahkan sel ke tempat
        Tempat tempat = new Tempat();
        tempat.tambahSel(sel);
        tempat.tambahSel(sel2);
        // Set ukuran tempat
        Tempat.batasKanan=500;
        Tempat.batasBawah=300;
        // buat tempatPanel dan tambahkan tempat ke tempatPanel
        TempatPanel tempatPanel = new TempatPanel();
        tempatPanel.setTempat(tempat);
        // buat gameFrame dan tambahkan tempatPanel ke gameFrame
        GameFrame game = new GameFrame("My Game",tempatPanel);
    }
}
