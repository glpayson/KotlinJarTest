package hello;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import whatever.Greeting;

public class JavaHello {
	public static String JavaHelloString = "Hello from Java!";

	public static String getHelloStringFromKotlin() {
		return KotlinHelloKt.getKotlinHelloString();
	}

	public static void main(String[] args) {
		System.out.println(getHelloStringFromKotlin());
		System.out.println(KotlinHelloKt.getHelloStringFromJava());
	}

	public Greeting getSailorGreeting() {
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
		return gson.fromJson(
				"{\"who_to_greet\": \"sailor\", \"salutation\": {\"message\": \"Hello, \"}}",
				Greeting.class);
	}

	public Greeting getKotlinGreeting() {
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
		return gson.fromJson(
				"{\"who_to_greet\": \"kotlin\", \"salutation\": {\"message\": \"Hello, \"}}",
				Greeting.class);
	}
}
