package entity ;

import java.io.Serializable;
import java.sql.Array;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemDieta implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int idLista;
@Column
private Array Alimentos;

}
