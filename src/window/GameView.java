package window;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import beatmap.Beatcheck;
import beatmap.Comboaudio;
import beatmap.Note;
import beatmap.Mapcreat;
import audioplay.SEplay;
import audioplay.Auditionplay;
import taiko.TestGame;
public class GameView extends JFrame{
	public static JPanel bgImg;
	static public int pX=0,pY=0,index=0,value=0,check=0,cot=4,hit=0,loady=-720,loadtime=240,songcheck=1;
	static public int miss=0,good=0,prefect=0,minx=1280,minj,hit_=0,hit__=0,scrint=0,hitscr,combo=0,hittime=2;
	static String ibg1 = "img/bg_.gif";
	static String ibg2 = "img/bg2_.gif";
	static String ibg3 = "img/bg3.png";
	static String ibg4 = "img/bg1.png";
	static String ibg5 = "img/bglogoman.gif";
	public GamebgImg gamebgimg = new GamebgImg();
	public static boolean D=false,F=false,J=false,K=false,R1=false,R2=false,L1=false,L2=false,fresh=false;
	public static boolean D_=false,F_=false,J_=false,K_=false,game=false,select=false,loading=false,gameplay=false;
	public static boolean result=false,result_=false,loading_=false,selectplay=false,start=true;
	public GameView(){
		init();	}
	public void init() {
		//1.画一个窗口
  	this.setSize(1280,750);
  	this.setLocation(55,50);
  	this.setTitle("太鼓达人~采风乐坊");
  	this.setResizable(false);
  	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	this.add(gamebgimg);
  	//this.add(new LoadingbgImg());
  	//this.add(loadingbgimg);
  	//game=true;
  	//select=true;
  	//selectplay=true;
  	this.setVisible(true); 	
	this.addKeyListener(new KeyListener(){//2.添加事件监听器
	@Override
	public void keyTyped(KeyEvent e) {			
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode){
		case KeyEvent.VK_ENTER:
			if(select){
				songcheck = Auditionplay.song(gamebgimg.sx,gamebgimg.sy);
				SEplay.BGMStop();
				SEplay.sePlay("audio/dong.wav");
				selectplay = false;
				select = false;
				loading = true;
			}else if(result_){
				SEplay.BGMStop();
				SEplay.sePlay("audio/dong.wav");
				result=false;
				result_=false;
				gameplay = false;
				game=false;
				loading_ = true;
			}
			break;
		case KeyEvent.VK_UP:
			if(select){
				SEplay.sePlay("audio/ka.wav");
				switch(gamebgimg.sy){
				case 181:
					gamebgimg.sy=401;
				break;
				case 291:
					gamebgimg.sy=181;
				break;
				case 401:
					gamebgimg.sy=291;
				break;
				}
				Auditionplay.auditionplay(gamebgimg.sx,gamebgimg.sy);
			}
		break;
		case KeyEvent.VK_DOWN:
			if(select){
				SEplay.sePlay("audio/ka.wav");
				switch(gamebgimg.sy){
				case 181:
					gamebgimg.sy=291;
				break;
				case 291:
					gamebgimg.sy=401;
				break;
				case 401:
					gamebgimg.sy=181;
				break;
				}
				Auditionplay.auditionplay(gamebgimg.sx,gamebgimg.sy);			
			}
		break;
		case KeyEvent.VK_RIGHT:
			if(select){
				SEplay.sePlay("audio/ka.wav");
				if(gamebgimg.sx==632)
					gamebgimg.sx=12;
				else
					gamebgimg.sx=632;
				Auditionplay.auditionplay(gamebgimg.sx,gamebgimg.sy);			
			}
		break;
		case KeyEvent.VK_LEFT:
			if(select){
				SEplay.sePlay("audio/ka.wav");
				if(gamebgimg.sx==632)
					gamebgimg.sx=12;
				else
					gamebgimg.sx=632;
				Auditionplay.auditionplay(gamebgimg.sx,gamebgimg.sy);	
			}
		break;
		case KeyEvent.VK_D:
			D = true;
	  		if(D&&!D_&&game){				
	  			gamebgimg.ly=8;
	  			SEplay.sePlay("audio/ka.wav");
	  			Beatcheck.d=true;
	  			GameView.D_=true;
	  		}
		break;
		case KeyEvent.VK_F:
			F = true;
	  		if(F&&!F_&&game){				
	  			gamebgimg.lx=8;
	  			SEplay.sePlay("audio/dong.wav");
	  			Beatcheck.f=true;
	  			GameView.F_=true;
	  		}
		break;
		case KeyEvent.VK_J:
			J = true;
	  		if(J&&!J_&&game){				
	  			gamebgimg.rx=8;
	  			SEplay.sePlay("audio/dong.wav");
	  			Beatcheck.j=true;
	  			GameView.J_=true;
	  		}
		break;
		case KeyEvent.VK_K:
			K = true;
			if(K&&!K_&&game){
	  			gamebgimg.ry=8;
	  			SEplay.sePlay("audio/ka.wav");
	  			Beatcheck.k=true;
	  			GameView.K_=true;
	  		}
		break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode){
		case KeyEvent.VK_D:
			D = false;
			D_ = false;
		break;
		case KeyEvent.VK_F:
			F = false;
			F_ = false;
		break;
		case KeyEvent.VK_J:
			J = false;
			J_ = false;
		break;
		case KeyEvent.VK_K:
			K = false;
			K_ = false;
		break;
		}
		
	}
	  		});
  	new Thread(){
  		public void run() {
  			try {Thread.sleep(3200);} catch (InterruptedException e) {e.printStackTrace();}
  			start=false;
  			selectplay=true;
  			select=true;
  			gamebgimg.repaint();
  			SEplay.BgmPlay("audio/春游_.wav");
  			while(true){  				
  				//每次隔一次循环
  					try {Thread.sleep(25);} catch (InterruptedException e) {e.printStackTrace();}
  					if(loading){
  						if(loady<0&&!gameplay){
  	  						loady+=10;
  	  					//System.out.println("loady="+loady);
  						}
  						if(loady==0){
  							gameplay=true;
  						}
  						loadtime--;
  						if(loadtime==0){
  							fresh=true;
  							loadtime=240;
  						}
  						if(fresh&&loady>-720){
  							loady-=10;
  							//System.out.println("loady="+loady);
  						}
  						if(fresh&&loady==-720){	
  							Auditionplay.songplay(songcheck);
  							Mapcreat.getmap(songcheck);
  							fresh=false;
  							index=0;
  							game=true;
  							loading=false;
  						}
  					}
  					if(loading_){
  						//System.out.println("1");
  						if(loady<0&&!selectplay){
  							//System.out.println("2");
  	  						loady+=10;
  						}
  						if(loady==0){
  							//System.out.println("3");
  							selectplay=true;
  						}
  						loadtime--;
  						if(loadtime==0){
  							//System.out.println("4");
  							fresh=true;
  							loadtime=240;
  						}
  						if(fresh&&loady>-720){
  							//System.out.println("5");
  							loady-=10;
  						}
  						if(fresh&&loady==-720){	
  							Auditionplay.auditionplay(gamebgimg.sx,gamebgimg.sy);
  							fresh=false;
  							select=true;
  							gamebgimg.repaint();
  							loading_=false;
  						}
  					}
  					if(game){
  						//System.out.print("1");
  	  					gamebgimg.lx--;
  	  					gamebgimg.ly--;
  	  					gamebgimg.rx--;
  	  					gamebgimg.ry--;
  	  					hittime--;
  	  					hit--;
  	  					hit_--;
  	  					hit__--;
  	  					cot--;
  	  					for(int j=0;j<gamebgimg.Nt.size();j++){
  	  						Note nt=gamebgimg.Nt.get(j);
							if(minx>nt.x&&nt.type!=0){minx=nt.x;minj=j;}
							if(j==gamebgimg.Nt.size()-1){
								Beatcheck.Check(gamebgimg.Nt.get(minj));
								if(Beatcheck.CheckM(gamebgimg.Nt.get(minj))){gamebgimg.Nt.remove(minj);}
							}
						}
  	  				    //System.out.print(minx);
  	  					minx=1280;
  						for(int i=0;i<gamebgimg.Nt.size();i++){
  							//System.out.print(i);
  							Note nt=gamebgimg.Nt.get(i);  									
  							if(nt.x<291&&(nt.type==1||nt.type==2||nt.type==3||nt.type==4)){
  								gamebgimg.Nt.remove(nt);
  								miss+=1;
  								GameView.hit__=7;
  								GameView.combo=0;
  							}
  							nt.x-=12;
  						}
  		  					if(cot<=0&&index<(Mapcreat.beatmap.length())){							
  		  						value=Mapcreat.beatmap.charAt(index)-48;	
  		  						index++;
  		  						Note nt_=new Note(1200,value);			
  		  						gamebgimg.Nt.add(nt_);
  		  						cot=4;
  		  						//System.out.println("index="+index+" result="+result);
		  					}
  		  					if(hittime==0){
	  		  					Beatcheck.d=false;
	  		  					Beatcheck.f=false;
	  		  					Beatcheck.j=false;
	  		  					Beatcheck.k=false;
	  		  					hittime=2;
  		  					}
  		  					
  		  					if(index==Mapcreat.beatmap.length()){
  		  					//System.out.println("truuuuuu");
  		  						result=true;
  		  					}
  		  					if(result&&!result_){ 		  					
  	  	  						loadtime-=1;
  	  	  						
  	  	  						if(loadtime==0||loadtime==1){
  	  	  						SEplay.sePlay("audio/dong.wav");
  	  	  							result_=true;
  	  	  							loadtime=80;
  	  	  							fresh=false;
  	  	  							 	  	  							
  	  	  						}
  		  					}
  						}
  							

  				//gamebgimg.repaint();
  				}
  			};
  		}.start();	
	
	}
	
}



	
