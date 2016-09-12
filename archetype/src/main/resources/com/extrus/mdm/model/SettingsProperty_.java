package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.593+0900")
@StaticMetamodel(SettingsProperty.class)
public class SettingsProperty_ {
	public static volatile SingularAttribute<SettingsProperty, String> id;
	public static volatile SingularAttribute<SettingsProperty, BigInteger> actionCompany;
	public static volatile SingularAttribute<SettingsProperty, String> actionSource;
	public static volatile SingularAttribute<SettingsProperty, BigInteger> actionTime;
	public static volatile SingularAttribute<SettingsProperty, BigInteger> actionUser;
	public static volatile SingularAttribute<SettingsProperty, String> category;
	public static volatile SingularAttribute<SettingsProperty, Date> createDate;
	public static volatile SingularAttribute<SettingsProperty, String> name;
	public static volatile SingularAttribute<SettingsProperty, String> propertyValue;
	public static volatile SingularAttribute<SettingsProperty, Date> updateDate;
}
