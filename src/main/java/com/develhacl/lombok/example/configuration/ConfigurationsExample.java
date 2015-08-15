package com.develhacl.lombok.example.configuration;

import com.develhack.annotation.feature.Access;
import com.develhack.annotation.feature.DTO;
import com.develhack.annotation.feature.InitializeFieldsByConstructor;
import com.develhack.annotation.feature.Meta;

/**
 * Example of the few configurations.
 */
@DTO
@InitializeFieldsByConstructor(allFieldsInitializer = Access.PUBLIC)
@Meta("Example of the few configurations")
public class ConfigurationsExample {

	/** FOO */
	private String foo;
	/** BAR */
	private String bar;
	/** BAZ */
	private String mBaz;
}
