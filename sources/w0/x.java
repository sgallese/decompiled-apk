package w0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f25263a = new x();

    private x() {
    }

    public final AutofillId a(ViewStructure viewStructure) {
        AutofillId autofillId;
        qc.q.i(viewStructure, "structure");
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    public final boolean b(AutofillValue autofillValue) {
        boolean isDate;
        qc.q.i(autofillValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        isDate = autofillValue.isDate();
        return isDate;
    }

    public final boolean c(AutofillValue autofillValue) {
        boolean isList;
        qc.q.i(autofillValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        isList = autofillValue.isList();
        return isList;
    }

    public final boolean d(AutofillValue autofillValue) {
        boolean isText;
        qc.q.i(autofillValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        isText = autofillValue.isText();
        return isText;
    }

    public final boolean e(AutofillValue autofillValue) {
        boolean isToggle;
        qc.q.i(autofillValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        qc.q.i(viewStructure, "structure");
        qc.q.i(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        qc.q.i(viewStructure, "structure");
        qc.q.i(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i10);
    }

    public final void h(ViewStructure viewStructure, int i10) {
        qc.q.i(viewStructure, "structure");
        viewStructure.setAutofillType(i10);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        CharSequence textValue;
        qc.q.i(autofillValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        textValue = autofillValue.getTextValue();
        qc.q.h(textValue, "value.textValue");
        return textValue;
    }
}
