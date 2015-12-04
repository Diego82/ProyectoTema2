package clasescine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sesion {

	private LocalDate dia;
	private List<String> horarios = new ArrayList<>();
	
	/**
	 * @param dia
	 * @param horario
	 */
	public Sesion() {
		dia= LocalDate.now();
		this.horarios.add("16:00");
		this.horarios.add("18:30");
		this.horarios.add("21:00");
		this.horarios.add("23:00");
		this.horarios.add("0:00");
	}


	public LocalDate getDia() {
		return dia;
	}


	public void setDia(LocalDate dia) {
		this.dia = dia;
	}


	public String getHorario(int hora) {
		String horario="";
		if (hora==0) {
			return horarios.get(hora);
		}else if (hora==1) {
			return horarios.get(hora);
		}else if (hora==2) {
			return horarios.get(hora);
		}else if (hora==3) {
			return horarios.get(hora);
		}else if (hora==4) {
			return horarios.get(hora);
		}
		return "";
	}

	@Override
	public String toString() {
		return "Sesion [dia=" + dia + ", horario=" + horarios + "]";
	}
}
