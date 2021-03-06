import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;


public class SampleCalculatorTest {
	Calculator calc = new Calculator();
	public static final Logger LOG = Logger.getLogger(SampleCalculatorTest.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat ("#.##");
	
	
	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		
		for (int i = 0; i<200; i++) {
			tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*10));
			tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*10));
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calc.add(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
		}
	}
		
		@Test
	public void testAddMediumSizedPositiveNumbers() {
			double tempRandomValue1 = 0;
			double tempRandomValue2 = 0;
			double tempResult = 0;
			
			for (int i = 0; i<200; i++) {
				tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*100));
				tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*100));
				tempResult = tempRandomValue1 + tempRandomValue2;
				LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
				assertEquals(calc.add(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
			}
		}

				@Test
			public void testAddLargeSizedPositiveNumbers() {
					double tempRandomValue1 = 0;
					double tempRandomValue2 = 0;
					double tempResult = 0;
					
					for (int i = 0; i<200; i++) {
						tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*1000));
						tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*1000));
						tempResult = tempRandomValue1 + tempRandomValue2;
						LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
						assertEquals(calc.add(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
					}

			
		}
			
			@Test
			public void testAddZeros(){
				double tempRandomValue1 = 0;
				double tempRandomValue2 = 0;
				double tempResult = 0;
				
				LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
				assertEquals(calc.add(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
			}
			
			@Test
			public void testAddSmallSizedNegativeNumbers() {
				double tempRandomValue1 = 0;
				double tempRandomValue2 = 0;
				double tempResult = 0;
				
				for (int i = 0; i<200; i++) {
					tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-10)));
					tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-10)));
					tempResult = tempRandomValue1 + tempRandomValue2;
					LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
					assertEquals(calc.add(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
				}
			}
				
				@Test
				public void testAddMediumSizedNegativeNumbers() {
					double tempRandomValue1 = 0;
					double tempRandomValue2 = 0;
					double tempResult = 0;
					
					for (int i = 0; i<200; i++) {
						tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-100)));
						tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-100)));
						tempResult = tempRandomValue1 + tempRandomValue2;
						LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
						assertEquals(calc.add(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
					}
				}

					@Test
				public void testAddLargeSizedNegativeNumbers() {
						double tempRandomValue1 = 0;
						double tempRandomValue2 = 0;
						double tempResult = 0;
						
						for (int i = 0; i<200; i++) {
							tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
							tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
							tempResult = tempRandomValue1 + tempRandomValue2;
							LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
							assertEquals(calc.add(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
						}

					
				}

					@Test
					public void testSubtractSmallSizedPositiveNumbers() {
						double tempRandomValue1 = 0;
						double tempRandomValue2 = 0;
						double tempResult = 0;
						
						for (int i = 0; i<200; i++) {
							tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*10));
							tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*10));
							tempResult = tempRandomValue1 - tempRandomValue2;
							LOG.info("Testing the method subtract with: " + tempRandomValue1 + " and " + tempRandomValue2);
							assertEquals(calc.subtract(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
						}
					}
						
						@Test
					public void testSubtractMediumSizedPositiveNumbers() {
							double tempRandomValue1 = 0;
							double tempRandomValue2 = 0;
							double tempResult = 0;
							
							for (int i = 0; i<200; i++) {
								tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*100));
								tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*100));
								tempResult = tempRandomValue1 - tempRandomValue2;
								LOG.info("Testing the method subtract with: " + tempRandomValue1 + " and " + tempRandomValue2);
								assertEquals(calc.subtract(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
							}
						}

								@Test
								public void testSubtractLargeSizedPositiveNumbers() {
									double tempRandomValue1 = 0;
									double tempRandomValue2 = 0;
									double tempResult = 0;
									
									for (int i = 0; i<200; i++) {
										tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*1000));
										tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*1000));
										tempResult = tempRandomValue1 - tempRandomValue2;
										LOG.info("Testing the method subtract with: " + tempRandomValue1 + " and " + tempRandomValue2);
										assertEquals(calc.subtract(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
									}

							
						}
							
							@Test
							public void testSubtractZeros(){
								double tempRandomValue1 = 0;
								double tempRandomValue2 = 0;
								double tempResult = 0;
								
								LOG.info("Testing the method subtract with: " + tempRandomValue1 + " and " + tempRandomValue2);
								assertEquals(calc.subtract(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
							}
							
							@Test
							public void testSubtractSmallSizedNegativeNumbers() {
								double tempRandomValue1 = 0;
								double tempRandomValue2 = 0;
								double tempResult = 0;
								
								for (int i = 0; i<200; i++) {
									tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-10)));
									tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-10)));
									tempResult = tempRandomValue1 - tempRandomValue2;
									LOG.info("Testing the method subtract with: " + tempRandomValue1 + " and " + tempRandomValue2);
									assertEquals(calc.subtract(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
								}
							}
								
								@Test
								public void testSubtractMediumSizedNegativeNumbers() {
									double tempRandomValue1 = 0;
									double tempRandomValue2 = 0;
									double tempResult = 0;
									
									for (int i = 0; i<200; i++) {
										tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-100)));
										tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-100)));
										tempResult = tempRandomValue1 - tempRandomValue2;
										LOG.info("Testing the method subtract with: " + tempRandomValue1 + " and " + tempRandomValue2);
										assertEquals(calc.subtract(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
									}
								}

									@Test
									public void testSubtractLargeSizedNegativeNumbers() {
										double tempRandomValue1 = 0;
										double tempRandomValue2 = 0;
										double tempResult = 0;
										
										for (int i = 0; i<200; i++) {
											tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
											tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
											tempResult = tempRandomValue1 - tempRandomValue2;
											LOG.info("Testing the method subtract with: " + tempRandomValue1 + " and " + tempRandomValue2);
											assertEquals(calc.subtract(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
										}

									
								}

									@Test
									public void testMultiplySmallSizedPositiveNumbers() {
										double tempRandomValue1 = 0;
										double tempRandomValue2 = 0;
										double tempResult = 0;
										
										for (int i = 0; i<200; i++) {
											tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*10));
											tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*10));
											tempResult = tempRandomValue1 * tempRandomValue2;
											LOG.info("Testing the method multiply with: " + tempRandomValue1 + " and " + tempRandomValue2);
											assertEquals(calc.multiply(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
										}
									}
										
										@Test
									public void testMultiplyMediumSizedPositiveNumbers() {
											double tempRandomValue1 = 0;
											double tempRandomValue2 = 0;
											double tempResult = 0;
											
											for (int i = 0; i<200; i++) {
												tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*100));
												tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*100));
												tempResult = tempRandomValue1 * tempRandomValue2;
												LOG.info("Testing the method multiply with: " + tempRandomValue1 + " and " + tempRandomValue2);
												assertEquals(calc.multiply(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
											}
										}

												@Test
											public void testMultiplyLargeSizedPositiveNumbers() {
													double tempRandomValue1 = 0;
													double tempRandomValue2 = 0;
													double tempResult = 0;
													
													for (int i = 0; i<200; i++) {
														tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*1000));
														tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*1000));
														tempResult = tempRandomValue1 * tempRandomValue2;
														LOG.info("Testing the method multiply with: " + tempRandomValue1 + " and " + tempRandomValue2);
														assertEquals(calc.multiply(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
													}

											
										}
											
											@Test
											public void testMultiplyZeros(){
												double tempRandomValue1 = 0;
												double tempRandomValue2 = 0;
												double tempResult = 0;
												
												LOG.info("Testing the method multiply with: " + tempRandomValue1 + " and " + tempRandomValue2);
												assertEquals(calc.multiply(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
											}
											
											@Test
											public void testMultiplySmallSizedNegativeNumbers() {
												double tempRandomValue1 = 0;
												double tempRandomValue2 = 0;
												double tempResult = 0;
												
												for (int i = 0; i<200; i++) {
													tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-10)));
													tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-10)));
													tempResult = tempRandomValue1 * tempRandomValue2;
													LOG.info("Testing the method multiply with: " + tempRandomValue1 + " and " + tempRandomValue2);
													assertEquals(calc.multiply(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
												}
											}
												
												@Test
												public void testMultiplyMediumSizedNegativeNumbers() {
													double tempRandomValue1 = 0;
													double tempRandomValue2 = 0;
													double tempResult = 0;
													
													for (int i = 0; i<200; i++) {
														tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-100)));
														tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-100)));
														tempResult = tempRandomValue1 * tempRandomValue2;
														LOG.info("Testing the method multiply with: " + tempRandomValue1 + " and " + tempRandomValue2);
														assertEquals(calc.multiply(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
													}
												}

													@Test
												public void testMultiplyLargeSizedNegativeNumbers() {	
														double tempRandomValue1 = 0;
														double tempRandomValue2 = 0;
														double tempResult = 0;
														
														for (int i = 0; i<200; i++) {
															tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
															tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
															tempResult = tempRandomValue1 * tempRandomValue2;
															LOG.info("Testing the method multiply with: " + tempRandomValue1 + " and " + tempRandomValue2);
															assertEquals(calc.multiply(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
														}
													}
													
													@Test
													public void testDivideSmallSizedPositiveNumbers() {
														double tempRandomValue1 = 0;
														double tempRandomValue2 = 0;
														double tempResult = 0;
														
														for (int i = 0; i<200; i++) {
															tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*10));
															tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*10));
															tempResult = tempRandomValue1 / tempRandomValue2;
															LOG.info("Testing the method divide with: " + tempRandomValue1 + " and " + tempRandomValue2);
															assertEquals(calc.divide(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
														}
													}
														
														@Test
													public void testDivideMediumSizedPositiveNumbers() {
															double tempRandomValue1 = 0;
															double tempRandomValue2 = 0;
															double tempResult = 0;
															
															for (int i = 0; i<200; i++) {
																tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*100));
																tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*100));
																tempResult = tempRandomValue1 / tempRandomValue2;
																LOG.info("Testing the method divide with: " + tempRandomValue1 + " and " + tempRandomValue2);
																assertEquals(calc.divide(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
															}
														}

																@Test
															public void testDivideLargeSizedPositiveNumbers() {
																	double tempRandomValue1 = 0;
																	double tempRandomValue2 = 0;
																	double tempResult = 0;
																	
																	for (int i = 0; i<200; i++) {
																		tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*1000));
																		tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*1000));
																		tempResult = tempRandomValue1 / tempRandomValue2;
																		LOG.info("Testing the method divide with: " + tempRandomValue1 + " and " + tempRandomValue2);
																		assertEquals(calc.divide(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
																	}

															
														}
															
													/*		@Test
															public void testDivideZeros(){
																double tempRandomValue1 = 0;
																double tempRandomValue2 = 0;
																double tempResult = 0;
																
																LOG.info("Testing the method divide with: " + tempRandomValue1 + " and " + tempRandomValue2);
																assertEquals(calc.divide(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
															}*/
															
															@Test
															public void testDivideSmallSizedNegativeNumbers() {
																double tempRandomValue1 = 0;
																double tempRandomValue2 = 0;
																double tempResult = 0;
																
																for (int i = 0; i<200; i++) {
																	tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-10)));
																	tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-10)));
																	tempResult = tempRandomValue1 / tempRandomValue2;
																	LOG.info("Testing the method divide with: " + tempRandomValue1 + " and " + tempRandomValue2);
																	assertEquals(calc.divide(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
																}
															}
																
																@Test
																public void testDivideMediumSizedNegativeNumbers() {
																	double tempRandomValue1 = 0;
																	double tempRandomValue2 = 0;
																	double tempResult = 0;
																	
																	for (int i = 0; i<200; i++) {
																		tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-100)));
																		tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-100)));
																		tempResult = tempRandomValue1 / tempRandomValue2;
																		LOG.info("Testing the method divide with: " + tempRandomValue1 + " and " + tempRandomValue2);
																		assertEquals(calc.divide(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
																	}
																}

																	@Test
																public void testDivideLargeSizedNegativeNumbers() {	
																		double tempRandomValue1 = 0;
																		double tempRandomValue2 = 0;
																		double tempResult = 0;
																		
																		for (int i = 0; i<200; i++) {
																			tempRandomValue1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
																			tempRandomValue2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
																			tempResult = tempRandomValue1 / tempRandomValue2;
																			LOG.info("Testing the method divide with: " + tempRandomValue1 + " and " + tempRandomValue2);
																			assertEquals(calc.divide(tempRandomValue1, tempRandomValue2), tempResult, 0.001);
																		}
																	}

													
}
					

