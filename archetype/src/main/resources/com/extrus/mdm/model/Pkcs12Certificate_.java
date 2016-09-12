package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.589+0900")
@StaticMetamodel(Pkcs12Certificate.class)
public class Pkcs12Certificate_ {
	public static volatile SingularAttribute<Pkcs12Certificate, String> id;
	public static volatile SingularAttribute<Pkcs12Certificate, BigInteger> actionCompany;
	public static volatile SingularAttribute<Pkcs12Certificate, String> actionSource;
	public static volatile SingularAttribute<Pkcs12Certificate, BigInteger> actionTime;
	public static volatile SingularAttribute<Pkcs12Certificate, BigInteger> actionUser;
	public static volatile SingularAttribute<Pkcs12Certificate, BigInteger> companyId;
	public static volatile SingularAttribute<Pkcs12Certificate, Date> createDate;
	public static volatile SingularAttribute<Pkcs12Certificate, String> hash;
	public static volatile SingularAttribute<Pkcs12Certificate, Byte> isCertificate;
	public static volatile SingularAttribute<Pkcs12Certificate, Byte> isTerminated;
	public static volatile SingularAttribute<Pkcs12Certificate, String> name;
	public static volatile SingularAttribute<Pkcs12Certificate, Date> notAfterDate;
	public static volatile SingularAttribute<Pkcs12Certificate, Date> notBeforeDate;
	public static volatile SingularAttribute<Pkcs12Certificate, String> password;
	public static volatile SingularAttribute<Pkcs12Certificate, byte[]> pkcs12Data;
	public static volatile SingularAttribute<Pkcs12Certificate, BigInteger> serialNumber;
	public static volatile SingularAttribute<Pkcs12Certificate, String> subjectDn;
	public static volatile SingularAttribute<Pkcs12Certificate, Integer> type;
	public static volatile SingularAttribute<Pkcs12Certificate, Date> updateDate;
}
