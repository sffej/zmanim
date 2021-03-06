/*
 * Copyright (c) 2011. Jay R. Gindin
 */

package net.sourceforge.zmanim.hebrewcalendar;

import org.junit.*;

/**
 * Validate the days in a Hebrew month (in various types of years) are correct.
 */
@SuppressWarnings( { "MagicNumber" } )
public class UT_DaysInJewishMonth {

	@Test
	public void daysInMonthsInHaserYear() {

		assertHaser( 5773 );
		assertHaser( 5777 );
		assertHaser( 5781 );
		assertHaserLeap( 5784 );
		assertHaserLeap( 5790 );
		assertHaserLeap( 5793 );
	}


	@Test
	public void daysInMonthsInQesidrahYear() {

		assertQesidrah( 5769 );
		assertQesidrah( 5772 );
		assertQesidrah( 5778 );
		assertQesidrah( 5786 );
		assertQesidrah( 5789 );
		assertQesidrah( 5792 );

		assertQesidrahLeap( 5782 );
	}


	@Test
	public void daysInMonthsInShalemYear() {

		assertShalem( 5770 );
		assertShalem( 5780 );
		assertShalem( 5783 );
		assertShalem( 5785 );
		assertShalem( 5788 );
		assertShalem( 5791 );
		assertShalem( 5794 );

		assertShalemLeap( 5771 );
		assertShalemLeap( 5774 );
		assertShalemLeap( 5776 );
		assertShalemLeap( 5779 );
		assertShalemLeap( 5787 );
		assertShalemLeap( 5795 );
	}


	private void assertHaser( int year ) {

		Assert.assertFalse( JewishDate.isCheshvanLong( year ) );
		Assert.assertTrue( JewishDate.isKislevShort( year ) );
	}


	private void assertHaserLeap( int year ) {

		assertHaser( year );
		Assert.assertTrue( JewishDate.isJewishLeapYear( year ) );
	}


	private void assertQesidrah( int year ) {

		Assert.assertFalse( JewishDate.isCheshvanLong( year ) );
		Assert.assertFalse( JewishDate.isKislevShort( year ) );
	}


	private void assertQesidrahLeap( int year ) {
		assertQesidrah( year );
		Assert.assertTrue( JewishDate.isJewishLeapYear( year ) );
	}


	private void assertShalem( int year ) {

		Assert.assertTrue( JewishDate.isCheshvanLong( year ) );
		Assert.assertFalse( JewishDate.isKislevShort( year ) );
	}


	private void assertShalemLeap( int year ) {

		assertShalem( year );
		Assert.assertTrue( JewishDate.isJewishLeapYear( year ) );
	}

} // End of UT_DaysInJewishMonth class
