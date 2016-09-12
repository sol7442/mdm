package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.590+0900")
@StaticMetamodel(ProductDevice.class)
public class ProductDevice_ {
	public static volatile SingularAttribute<ProductDevice, String> id;
	public static volatile SingularAttribute<ProductDevice, BigInteger> actionCompany;
	public static volatile SingularAttribute<ProductDevice, String> actionSource;
	public static volatile SingularAttribute<ProductDevice, BigInteger> actionTime;
	public static volatile SingularAttribute<ProductDevice, BigInteger> actionUser;
	public static volatile SingularAttribute<ProductDevice, String> binaryFilePath;
	public static volatile SingularAttribute<ProductDevice, BigInteger> companyId;
	public static volatile SingularAttribute<ProductDevice, Date> createDate;
	public static volatile SingularAttribute<ProductDevice, String> modelName;
	public static volatile SingularAttribute<ProductDevice, String> name;
	public static volatile SingularAttribute<ProductDevice, String> osName;
	public static volatile SingularAttribute<ProductDevice, Integer> osType;
	public static volatile SingularAttribute<ProductDevice, String> osVersion;
	public static volatile SingularAttribute<ProductDevice, Integer> status;
	public static volatile SingularAttribute<ProductDevice, Date> updateDate;
	public static volatile SingularAttribute<ProductDevice, String> vendorName;
}
