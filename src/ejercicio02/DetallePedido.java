package ejercicio02;

public class DetallePedido {
	private Producto producto;
	private Integer cantidad;
	
	public DetallePedido(Producto unProducto, Integer cant) {
		this.producto = unProducto;
		this.cantidad = cant;
	}	
	
	public Producto getProducto() {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public double totalLinea() {
		//retorna el precio de esa línea del pedido. A su vez el pedido tiene un método que retorna el subtotal
		//(el precio de cada línea de pedido) y el total, que es el subtotal mas el 21% de IVA en caso de que 
		//el cliente sea consumidor final.
		return ((Double) this.producto.getPrecio() * this.cantidad);
	}
}