package w0;

import ec.n0;
import java.util.HashMap;

/* compiled from: AndroidAutofillType.android.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<e0, String> f25261a;

    static {
        HashMap<e0, String> j10;
        j10 = n0.j(dc.r.a(e0.EmailAddress, "emailAddress"), dc.r.a(e0.Username, "username"), dc.r.a(e0.Password, "password"), dc.r.a(e0.NewUsername, "newUsername"), dc.r.a(e0.NewPassword, "newPassword"), dc.r.a(e0.PostalAddress, "postalAddress"), dc.r.a(e0.PostalCode, "postalCode"), dc.r.a(e0.CreditCardNumber, "creditCardNumber"), dc.r.a(e0.CreditCardSecurityCode, "creditCardSecurityCode"), dc.r.a(e0.CreditCardExpirationDate, "creditCardExpirationDate"), dc.r.a(e0.CreditCardExpirationMonth, "creditCardExpirationMonth"), dc.r.a(e0.CreditCardExpirationYear, "creditCardExpirationYear"), dc.r.a(e0.CreditCardExpirationDay, "creditCardExpirationDay"), dc.r.a(e0.AddressCountry, "addressCountry"), dc.r.a(e0.AddressRegion, "addressRegion"), dc.r.a(e0.AddressLocality, "addressLocality"), dc.r.a(e0.AddressStreet, "streetAddress"), dc.r.a(e0.AddressAuxiliaryDetails, "extendedAddress"), dc.r.a(e0.PostalCodeExtended, "extendedPostalCode"), dc.r.a(e0.PersonFullName, "personName"), dc.r.a(e0.PersonFirstName, "personGivenName"), dc.r.a(e0.PersonLastName, "personFamilyName"), dc.r.a(e0.PersonMiddleName, "personMiddleName"), dc.r.a(e0.PersonMiddleInitial, "personMiddleInitial"), dc.r.a(e0.PersonNamePrefix, "personNamePrefix"), dc.r.a(e0.PersonNameSuffix, "personNameSuffix"), dc.r.a(e0.PhoneNumber, "phoneNumber"), dc.r.a(e0.PhoneNumberDevice, "phoneNumberDevice"), dc.r.a(e0.PhoneCountryCode, "phoneCountryCode"), dc.r.a(e0.PhoneNumberNational, "phoneNational"), dc.r.a(e0.Gender, "gender"), dc.r.a(e0.BirthDateFull, "birthDateFull"), dc.r.a(e0.BirthDateDay, "birthDateDay"), dc.r.a(e0.BirthDateMonth, "birthDateMonth"), dc.r.a(e0.BirthDateYear, "birthDateYear"), dc.r.a(e0.SmsOtpCode, "smsOTPCode"));
        f25261a = j10;
    }

    public static final String a(e0 e0Var) {
        qc.q.i(e0Var, "<this>");
        String str = f25261a.get(e0Var);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}
