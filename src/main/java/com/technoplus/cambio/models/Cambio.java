package com.technoplus.cambio.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cambio implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	 private String result;
	    private String provider;
	    private String documentation;
	    private String terms_of_use;
	    private int time_last_update_unix;
	    private String time_last_update_utc;
	    private int time_next_update_unix;
	    private String time_next_update_utc;
	    private int time_eol_unix;
	    private String base_code;
	    
	    @ManyToOne(cascade = {CascadeType.ALL})
		@JoinColumn(name="rates_id")
	    private Rates rates;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getProvider() {
			return provider;
		}

		public void setProvider(String provider) {
			this.provider = provider;
		}

		public String getDocumentation() {
			return documentation;
		}

		public void setDocumentation(String documentation) {
			this.documentation = documentation;
		}

		public String getTerms_of_use() {
			return terms_of_use;
		}

		public void setTerms_of_use(String terms_of_use) {
			this.terms_of_use = terms_of_use;
		}

		public int getTime_last_update_unix() {
			return time_last_update_unix;
		}

		public void setTime_last_update_unix(int time_last_update_unix) {
			this.time_last_update_unix = time_last_update_unix;
		}

		public String getTime_last_update_utc() {
			return time_last_update_utc;
		}

		public void setTime_last_update_utc(String time_last_update_utc) {
			this.time_last_update_utc = time_last_update_utc;
		}

		public int getTime_next_update_unix() {
			return time_next_update_unix;
		}

		public void setTime_next_update_unix(int time_next_update_unix) {
			this.time_next_update_unix = time_next_update_unix;
		}

		public String getTime_next_update_utc() {
			return time_next_update_utc;
		}

		public void setTime_next_update_utc(String time_next_update_utc) {
			this.time_next_update_utc = time_next_update_utc;
		}

		public int getTime_eol_unix() {
			return time_eol_unix;
		}

		public void setTime_eol_unix(int time_eol_unix) {
			this.time_eol_unix = time_eol_unix;
		}

		public String getBase_code() {
			return base_code;
		}

		public void setBase_code(String base_code) {
			this.base_code = base_code;
		}

		public Rates getRates() {
			return rates;
		}

		public void setRates(Rates rates) {
			this.rates = rates;
		}
	    
	

}
