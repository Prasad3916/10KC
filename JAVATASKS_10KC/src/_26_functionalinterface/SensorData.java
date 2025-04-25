package _26_functionalinterface;
import java.util.function.Function;
public class SensorData {
	double temperature;
	double humidity;
	public SensorData(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;}
	public double getTemperature() {
		return temperature;}
	public void setTemperature(double temperature) {
		this.temperature = temperature;}
	public double getHumidity() {
		return humidity;}
	public void setHumidity(double humidity) {
		this.humidity = humidity;}
	public static void main(String[] args) {
		int threshold=40;
		Function<SensorData, Double> fi1=new Function<SensorData,Double>(){
			public Double apply(SensorData s) {
				return s.temperature;
			}};
		Function<Double,Boolean> fi2=new Function<Double,Boolean>(){
			public Boolean apply(Double t) {
				return t>threshold;
			}};
		SensorData sd=new SensorData(40,30);
		Double d=fi1.apply(sd);
		System.out.println(fi2.apply(d));	
	}
}
