package window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import beatmap.Note;

public class GamebgImg  extends JPanel{
		public int pX=0,pY=0,lx=0,ly=0,rx=0,ry=0;
		 String ibg1 = "img/bg1_.gif";
		// String ibg2 = "img/bg2_.gif";
		 String ibg3 = "img/bg3.png";
		 String ibg4 = "img/bg1.png";
		 String ibg5 = "img/bglogoman.gif";
		 String ibg6 = "img/bg6.png";
		 String ibg6_ = "img/bg6_.png";
		 String ibg7 = "img/aim.png";
		 String ibg8 = "img/hit.gif";
		 String ibg8_ = "img/good.gif";
		 String ibg8__ = "img/miss.gif";
		 String ibg9 = "img/result.png";
		 String l1 = "img/l1.png";
		 String l2 = "img/l2.png";
		 String r1 = "img/r1.png";
		 String r2 = "img/r2.png";
		String test = "img/instead.png";
		String scr,com,hit,good,miss,prefect;
		ArrayList<Note> Nt=new ArrayList<Note>();
		Font score= new Font("DFPKanTeiRyu-XB",0,30);
		Font Combo= new Font("DFPKanTeiRyu-XB",0,50);
		Font Combo_= new Font("DFPKanTeiRyu-XB",0,20);
		public int sx=12,sy=181;
		static String isl1 = "img/select.gif";
		static String isl2 = "img/select.png";
		static String isl3 = "img/select1.png";
		Font song= new Font("DFPKanTeiRyu-XB",0,50);
		Font res= new Font("DFPKanTeiRyu-XB",0,50);
		String ild1 = "img/loading.png";
		String ild2 = "img/dancer.gif";
		String log = "img/taikocg.gif";
		public void paintComponent(Graphics g){
			if(GameView.start){
				Image cg = new ImageIcon(log).getImage();
	  			g.drawImage(cg,0,0,1280,720,this);
			}
			if(GameView.gameplay){
				//super.paintComponents(g);
	  			Image bg1 = new ImageIcon(ibg1).getImage();
	  			g.drawImage(bg1,pX,pY,1280,720,this);
	  			//Image bg2 = new ImageIcon(ibg2).getImage();
	  			//g.drawImage(bg2,pX,pY,1280,720,this);
	  			Image bg4 = new ImageIcon(ibg4).getImage();
	  			g.drawImage(bg4,205,247,1072,130,this);	
	  			Image bg6 = new ImageIcon(ibg6).getImage();
	  			Image bg6_ = new ImageIcon(ibg6_).getImage();			
	  			Image bg5 = new ImageIcon(ibg5).getImage();
	  			g.drawImage(bg5,50,10,350,237,this);
	  			Image bg7 = new ImageIcon(ibg7).getImage();
	  			g.drawImage(bg7,350,243,138,138,this);
	  			if(lx>0||rx>0){
	  				g.drawImage(bg6,205,247,1072,132,this);
	  			}
	  			if(ly>0||ry>0){
	  				g.drawImage(bg6_,205,247,1072,132,this);
	  			}
				for(int i=0;i<Nt.size();i++){
					Note note=Nt.get(i);
					Image ant = new ImageIcon(note.Image).getImage();
					g.drawImage(ant, note.x,243,138,138, this);	
				}
	  			Image bg3 = new ImageIcon(ibg3).getImage();
	  			g.drawImage(bg3,pX,193,1280,427,this);
	  			//Image test1 = new ImageIcon(test).getImage();
	  			//g.drawImage(test1,260,243,138,138,this);
	  			Image bg8 = new ImageIcon(ibg8).getImage();
	  			Image bg8_ = new ImageIcon(ibg8_).getImage();
	  			Image bg8__ = new ImageIcon(ibg8__).getImage();
	  			if(GameView.hit>0){
	  				g.drawImage(bg8,301,195,235,235,this);
	  				com=String.valueOf(GameView.hitscr);
	  				com="+"+com;
	  				g.setFont(score);
	  				g.setColor(Color.yellow);
	  				g.drawString(com, 83, 312);
	  			}
	  			if(GameView.hit_>0){
	  				g.drawImage(bg8_,301,195,235,235,this);
	  				com=String.valueOf(GameView.hitscr);
	  				com="+"+com;
	  				g.setFont(score);
	  				g.setColor(Color.yellow);
	  				g.drawString(com, 83, 312);
	  			}
	  			if(GameView.hit__>0){
	  				g.drawImage(bg8__,301,195,235,235,this);
	  			}
	  			if(lx>0){
	  				Image la = new ImageIcon(l1).getImage();
	  	  			g.drawImage(la,199,260,52,89,this);
	  			}
	  			if(ly>0){
	  				Image lb = new ImageIcon(l2).getImage();
	  	  			g.drawImage(lb,181,244,70,132,this);
	  			}
	  			if(rx>0){
	  				Image ra = new ImageIcon(r1).getImage();
	  	  			g.drawImage(ra,250,260,52,89,this);		
	  			}
	  			if(ry>0){
	  				Image rb = new ImageIcon(r2).getImage();
	  	  			g.drawImage(rb,250,244,70,132,this);
	  			}
	  			scr=String.format("%08d", GameView.scrint);
	  			com=String.valueOf(GameView.combo);
	  			g.setFont(score);
				g.setColor(Color.white);
				g.drawString(scr, 3, 276);
				g.setFont(Combo);
				g.setColor(Color.black);
				if(GameView.combo>=10&&GameView.combo<100){
					g.setFont(Combo);
					g.drawString(com, 217, 317);
					g.setFont(Combo_);
					g.drawString("combo", 217, 337);
				}
				if(GameView.combo>=100){
					g.setFont(Combo);
					g.drawString(com, 204, 317);
					g.setFont(Combo_);
					g.drawString("combo", 217, 337);
				}
			}
			if(GameView.result_){
				Image bg9 = new ImageIcon(ibg9).getImage();
				g.drawImage(bg9,200,-50,1280,720,this);
				prefect=String.valueOf(GameView.prefect);
				good=String.valueOf(GameView.good);
				miss=String.valueOf(GameView.miss);
				g.setFont(res);
				g.setColor(Color.orange);
				g.drawString(prefect, 670,332);
				g.setColor(Color.white);
				g.drawString(good, 860, 332);
				g.setColor(Color.blue);
				g.drawString(miss, 1070, 332);
			}
			if(GameView.selectplay){
				Image sl1 = new ImageIcon(isl1).getImage();
				g.drawImage(sl1,0,0,1280,720,this);
				Image sl2 = new ImageIcon(isl2).getImage();
				g.drawImage(sl2,0,0,1280,720,this);
				g.setFont(song);
				g.setColor(Color.black);
				g.drawString("1.´ºß[¡ï¡ï¡ï¡ï¡ï¡ï",150, 266);
				g.drawString("2.¼¾Çú¡ï¡ï¡ï¡ï¡ï",150, 376);
				g.drawString("3.Ðî„Ý¡ï¡ï¡ï¡ï¡ï¡ï",150, 486);
				g.drawString("4.Í‘×ƒ¡ï¡ï¡ï¡ï¡ï¡ï",770, 266);
				g.drawString("5.¾`·Å¡ï¡ï¡ï¡ï¡ï¡ï",770, 376);
				g.drawString("6.»¨Ñú¡ï¡ï¡ï¡ï¡ï",770, 486);
				Image sl3 = new ImageIcon(isl3).getImage();
				g.drawImage(sl3,sx,sy,138,136,this);
				//g.drawImage(sl3,12,181,138,136,this);
				//g.drawImage(sl3,12,291,138,136,this);
				//g.drawImage(sl3,12,401,138,136,this);
				//g.drawImage(sl3,632,181,138,136,this);
				//g.drawImage(sl3,632,291,138,136,this);
				//g.drawImage(sl3,632,401,138,136,this);	
			}
			if(GameView.loading||GameView.loading_){
				Image ld1 = new ImageIcon(ild1).getImage();
				g.drawImage(ld1,0,GameView.loady,1280,720,this);
				if(GameView.loady==0){
					Image ld2 = new ImageIcon(ild2).getImage();
					g.drawImage(ld2,490,420,300,300,this);
				}
			}
	    }


}
