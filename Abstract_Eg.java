package Abstraction;

abstract class Bank {
	abstract int rateOfInterest();
}
class RBI extends Bank{
	int rateOfInterest() {
	return 7;
}}
class PNB extends Bank{
	int rateOfInterest() {
	return 9;
}}
class BOB extends Bank{
	int rateOfInterest() {
	return 6;
}}
class SBI extends Bank{
	int rateOfInterest() {
	return 8;
}}
public class Abstract_Eg{
	public static void main(String[] args) {
		Bank bank;
		bank=new SBI();
		System.out.println(bank.rateOfInterest());
	}
	
}
