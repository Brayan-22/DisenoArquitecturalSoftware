package com.disenoarquitecturalpatrones.restaurante.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Cliente {
	@Id
	@NotNull
	private Long idCliente;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@Email
	@NotBlank
	private String correo;
	@Pattern(regexp = "[a-zA-Z0-9_.]")
	private String password;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Cliente(@NotNull Long idCliente, @NotBlank String nombre, @NotBlank String apellido,
			@Email @NotBlank String correo, @Pattern(regexp = "[a-zA-Z0-9]") String password) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
	}

	public Cliente() {
	}
}
