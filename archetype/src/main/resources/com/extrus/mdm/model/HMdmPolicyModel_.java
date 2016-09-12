package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.565+0900")
@StaticMetamodel(HMdmPolicyModel.class)
public class HMdmPolicyModel_ {
	public static volatile SingularAttribute<HMdmPolicyModel, String> id;
	public static volatile SingularAttribute<HMdmPolicyModel, BigInteger> actionCompany;
	public static volatile SingularAttribute<HMdmPolicyModel, String> actionSource;
	public static volatile SingularAttribute<HMdmPolicyModel, BigInteger> actionTime;
	public static volatile SingularAttribute<HMdmPolicyModel, BigInteger> actionUser;
	public static volatile SingularAttribute<HMdmPolicyModel, Byte> baseFlag;
	public static volatile SingularAttribute<HMdmPolicyModel, Date> createDate;
	public static volatile SingularAttribute<HMdmPolicyModel, String> name;
	public static volatile SingularAttribute<HMdmPolicyModel, String> policyDesc;
	public static volatile SingularAttribute<HMdmPolicyModel, BigInteger> policyId;
	public static volatile SingularAttribute<HMdmPolicyModel, String> policyVersion;
	public static volatile SingularAttribute<HMdmPolicyModel, Date> updateDate;
}
