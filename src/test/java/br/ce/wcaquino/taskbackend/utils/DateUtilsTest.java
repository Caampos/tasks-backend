package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		
		LocalDate date = LocalDate.of(2030, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
		
	}
		
		
	@Test
		public void deveRetornarFalsoParaDatasPassadas() {
			
			LocalDate date = LocalDate.of(2030, 01, 01);
			Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
			
	}
				
	@Test
			public void deveRetornarTrueParaDatasAtual() {
				
				LocalDate date = LocalDate.of(2030, 01, 01);
				Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
					
		
		
	}
}
