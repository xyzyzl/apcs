import java.util.*;
import java.io.*;

public class Yes {
	public static void geniosity(int tmw_orz)
	{
		if(tmw_orz == 0)
		{
			System.out.println("Жарык болуп, жашоомдо жаралдың,\n"+
			"Жаркыным деп, эркелеттим сүйө алдым.\n" +
			"Жаным менин, жаркыраган алтыным,\n" +
			"Жарты кылып кимге, кимге мени кыя алдың?");
		} else if(tmw_orz == 1)
		{
			System.out.println("Жүрөгүм жакындатпай эч кимди,\n" + 
			"Жүдөттү го, жүрөгүм аруу сезимди.\n" +
			"Жамгыр болуп, төгүлүп ыйлап келет,\n" +
			"Жабыркаган жүрөгүмдүн тең кесими.");
		}
	} // https://www.youtube.com/watch?v=ZvDU532l2wI&list=PLpuAHIgm8rOKm7iRmj1WGhNzlQsNxer-3 is link to song
	public static void wtmoo()
	{
		System.out.println("Алоолоп оттой жанып, жанып күйдүм ай,\n" +
			"Неге мен жаным сени мынча сүйдүм ай?\n" +
			"А мен өзүңдү күтүп келемин тажабай!");
	}
	public static void wtmoo(boolean tmw_orz)
	{
		if(tmw_orz)
		{
			System.out.println("Өзүңдү күттүм, күттүм, күттүм, күттүм ай,\n" +
			"Жүрөгүм ооруп турат сага жете албай,\n" +
			"А мен өзүңдү издей беремин таба албай!");
		}
		else
		{
			System.out.println("Мен сени күттүм, күттүм, күттүм, күттүм ай,\n" +
			"Жүрөгүм ооруп турат сага жете албай,\n" +
			"А мен өзүңдү издей беремин таба албай!");
		}
	}
	public static void end()
	{
		System.out.println("А мен өзүңдү күтүп келемин тажабай!\n"+
		"А мен өзүңдү күтүп келемин тажабай!\n"+
		"Мен өзүңдү күтүп келемин тажабай!");
	}
	public static void main(String[] args) {
		System.out.println("some random song i found on youtube:");
		System.out.println();

		geniosity(0);
		System.out.println();
		wtmoo(false);
		wtmoo();
		System.out.println();
		geniosity(1);
		System.out.println();
		wtmoo(false);
		wtmoo();
		System.out.println();
		wtmoo(true);
		System.out.println();
		end();
	}
}