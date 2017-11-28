using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();

		buttonAceptar.Clicked += delegate {
			Button button = new Button();
			button.Label = " Boton creado ";
			button.Visible = true;
			vbox1.Add(button);
			//labelSaludo.Text = "Hola " + entryNombre.Text;
		};
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}


