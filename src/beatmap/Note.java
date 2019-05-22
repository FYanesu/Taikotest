package beatmap;

import java.awt.event.KeyEvent;

public class Note {

		//×ø±ê
		public int x;
		public int type;
		public boolean hit;
		//Í¼Æ¬
		public String Image;		
		public Note(int x,int type) {

			this.x = x;
			this.type = type;
			switch(type){
			case 0:
				this.Image = "img/dk.png";
			break;
			case 1:
				this.Image = "img/da.png";
			break;
			case 2:
				this.Image = "img/ka.png";
			break;
			case 3:
				this.Image = "img/da_.png";
			break;
			case 4:
				this.Image = "img/ka_.png";
			break;
			}
			this.hit = false;
			//this.leapset = leapset;
		}

		
}
