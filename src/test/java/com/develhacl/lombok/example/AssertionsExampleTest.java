package com.develhacl.lombok.example;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class AssertionsExampleTest {

	AssertionsExample tested = new AssertionsExample();

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "target must be non-null.")
	public void constructor_RunnableTypeArgumentIsNull_ThrowsException() {
		new AssertionsExample(null, "foo");
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "name must be non-empty, but it is null.")
	public void constructor_StringTypeArgumentIsNull_ThrowsException() {
		new AssertionsExample(() -> {}, null);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "name must be non-empty, but it is empty.")
	public void constructor_StringTypeArgumentIsEmpty_ThrowsException() {
		new AssertionsExample(() -> {}, "");
	}

	@Test
	public void constructor_AllArgumentsIsValid_ReturnsNormally() {
		new AssertionsExample(() -> {}, "foo");
	}

	@Test
	public void nonnull_ArgumentIsNonnull_ReturnsNormally() throws Exception {
		tested.nonnull("");
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be non-null.")
	public void nonnull_ArgumentIsNull_ThrowsException() throws Exception {
		tested.nonnull(null);
	}

	public void nonempty_ArgumentIsNonempty_ReturnsNormally() throws Exception {
		tested.nonempty("foo");
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be non-empty, but it is null.")
	public void nonempty_ArgumentIsNull_ThrowsException() throws Exception {
		tested.nonempty(null);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be non-empty, but it is empty.")
	public void nonempty_ArgumentIsEmpty_ThrowsException() throws Exception {
		tested.nonempty("");
	}

	public void nonemptyWithNullable_ArgumentIsNonempty_ReturnsNormally() throws Exception {
		tested.nonemptyWithNullable("foo");
	}

	@Test
	public void nonemptyWithNullable_ArgumentIsNull_ReturnsNormally() throws Exception {
		tested.nonemptyWithNullable(null);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be non-empty, but it is empty.")
	public void nonemptyWithNullable_ArgumentIsEmpty_ThrowsException() throws Exception {
		tested.nonemptyWithNullable("");
	}

	@Test
	public void validNumber_ArgumentIsValidNumber_ReturnsNormally() throws Exception {
		tested.validNumber(0.0D);
	}

	@Test
	public void validNumber_ArgumentIsPosiriveInfinity_ReturnsNormally() throws Exception {
		tested.validNumber(Double.POSITIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be valid number, but it is NaN.")
	public void validNumber_ArgumentIsNaN_ThrowsException() throws Exception {
		tested.validNumber(Double.NaN);
	}

	@Test
	public void finiteNumber_ArgumentIsFiniteNumber_ReturnsNormally() throws Exception {
		tested.finiteNumber(0.0D);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be finite number, but it is Infinity.")
	public void finiteNumber_ArgumentIsPosiriveInfinity_ThrowsException() throws Exception {
		tested.finiteNumber(Double.POSITIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be finite number, but it is NaN.")
	public void finiteNumber_ArgumentIsNaN_ThrowsException() throws Exception {
		tested.finiteNumber(Double.NaN);
	}

	@Test
	public void greaterThanLiteralValue_ArgumentIsGreaterThanTheLiteralValue_ReturnsNormally() throws Exception {
		tested.greaterThanLiteralValue(2);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be greater than 1, but it is 0.")
	public void greaterThanLiteralValue_ArgumentIsLessThanTheLiteralValue_ThrowsException() throws Exception {
		tested.greaterThanLiteralValue(0);
	}

	@Test
	public void greaterThanConstantValue_ArgumentIsGreaterThanTheConstantValue_ReturnsNormally() throws Exception {
		tested.greaterThanConstantValue(0);
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be greater than -2147483648, but it is -2147483648.")
	public void greaterThanLiteralValue_ArgumentIsEqualToTheConstantValue_ThrowsException() throws Exception {
		tested.greaterThanConstantValue(Integer.MIN_VALUE);
	}

	@Test
	public void inRangeOfLocalDateTime_ArgumentIsInRangeOfTheLocalDateTimeRepresentedByString_ReturnsNormally()
			throws Exception {
		tested.inRangeOfLocalDateTime(LocalDateTime.parse("2015-01-01T12:34:16"));
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "arg must be in the range of from 2015-01-01T12:34:16 to 2015-12-31T12:34:15, but it is 2015-12-31T12:34:16.")
	public void inRangeOfLocalDateTime_ArgumentIsOutOfRangeOfTheLocalDateTimeRepresentedByString_ThrowsException()
			throws Exception {
		tested.inRangeOfLocalDateTime(LocalDateTime.parse("2015-12-31T12:34:16"));
	}

}
