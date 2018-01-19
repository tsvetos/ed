using System;
using System.Collections.Generic;
using Gtk;
using Gdk;

namespace CBingo
{
	public class Bombo
	{

		private List <int> bolas = new List();

		public Bombo (){
			for (int bola = 1; bola <= 90; bola++)
				bolas.Add (bola);
		}

		private Random random = new Random();
		public int SacarBola(){
			return 1; //TODO

			//int indexAleatorio = random.Next (bolas.Count);
			//int bola = bolas[indexAleatorio];
			//bolas.Remove(bola);
			//int indexPanel = bola - 1;

			

		}

		public bool QuedanBolas(){
			return true;
		}
	}
}

