package entity;
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GerenciaDieta implements Serializable{
//@Column
private int idUsuario;
@Column
private int idItem;


private Double CalTotal;



private String Data;

Usuario usuario = new Usuario();

public Calendar getData() {
Calendar Data = Calendar.getInstance();  
	return Data;
}

public int getidUsuario() {
return idUsuario;
}
public void setidUsuario(int idUsuario) {
this.idUsuario = idUsuario;
}
public int idItem() {
return idItem;
}
public void setidItem(int idItem) {
this.idItem = idItem;
}
public Double getCalTotal() {
return CalTotal;
}
public void setCalTotal(Double CalTotal) {
	this.CalTotal = CalTotal;
}

public void CalcTMB (String sexo, double peso, double altura, int idade){

if (sexo == "Homem"){ 
usuario.setTmb(88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * idade));
}else
	
if(sexo == "Mulher"){
usuario.setTmb(447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * idade));
}

switch (usuario.getExercicio()) {
 
 case 1:  usuario.setTmb(usuario.getTmb() * 1.2);
 break;
 case 2:  usuario.setTmb(usuario.getTmb() * 1.375);
 break;
 case 3:  usuario.setTmb(usuario.getTmb() * 1.55);
 break;
 case 4:  usuario.setTmb(usuario.getTmb() * 1.725);
 break;
 case 5:  usuario.setTmb(usuario.getTmb() * 1.9);
 break;
 
}

}

	public void CalcCal(/*alimentos*/){

	//puxar lista do ItemDieta	

	}
}
