package com.example.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLUtils {
	private static final String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com/users";
	
	final HttpURLConnection httpURLConnection = null;
	
	public void fetchHttp() {
		try {
			final URL url = new URL(JSON_PLACEHOLDER_URL);
			try {
				final HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
				httpURLConnection.connect();

				final int responseCode = httpURLConnection.getResponseCode();
				if (responseCode == HttpURLConnection.HTTP_OK) {
					final BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
					String line = null;
					final StringBuffer response = new StringBuffer();
					
					while ((line = in.readLine()) != null) {
						response.append(line);
					}
					in.close();
					System.out.println(response.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		URLUtils url = new URLUtils();
		url.fetchHttp();
	}
}
