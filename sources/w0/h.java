package w0;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes.dex */
public final class h {
    public static final void a(e eVar, SparseArray<AutofillValue> sparseArray) {
        qc.q.i(eVar, "<this>");
        qc.q.i(sparseArray, "values");
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            AutofillValue a10 = g.a(sparseArray.get(keyAt));
            x xVar = x.f25263a;
            qc.q.h(a10, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (xVar.d(a10)) {
                eVar.b().b(keyAt, xVar.i(a10).toString());
            } else if (!xVar.b(a10)) {
                if (!xVar.c(a10)) {
                    if (xVar.e(a10)) {
                        throw new dc.k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                } else {
                    throw new dc.k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
            } else {
                throw new dc.k("An operation is not implemented: b/138604541: Add onFill() callback for date");
            }
        }
    }

    public static final void b(e eVar, ViewStructure viewStructure) {
        int d10;
        int d11;
        int d12;
        int d13;
        qc.q.i(eVar, "<this>");
        qc.q.i(viewStructure, "root");
        int a10 = n.f25262a.a(viewStructure, eVar.b().a().size());
        for (Map.Entry<Integer, c0> entry : eVar.b().a().entrySet()) {
            int intValue = entry.getKey().intValue();
            c0 value = entry.getValue();
            n nVar = n.f25262a;
            ViewStructure b10 = nVar.b(viewStructure, a10);
            if (b10 != null) {
                x xVar = x.f25263a;
                AutofillId a11 = xVar.a(viewStructure);
                qc.q.f(a11);
                xVar.g(b10, a11, intValue);
                nVar.d(b10, intValue, eVar.c().getContext().getPackageName(), null, null);
                xVar.h(b10, 1);
                List<e0> a12 = value.a();
                ArrayList arrayList = new ArrayList(a12.size());
                int size = a12.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(f.a(a12.get(i10)));
                }
                xVar.f(b10, (String[]) arrayList.toArray(new String[0]));
                z0.h b11 = value.b();
                if (b11 != null) {
                    d10 = sc.c.d(b11.i());
                    d11 = sc.c.d(b11.l());
                    d12 = sc.c.d(b11.j());
                    d13 = sc.c.d(b11.e());
                    n.f25262a.c(b10, d10, d11, 0, 0, d12 - d10, d13 - d11);
                } else {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
            }
            a10++;
        }
    }
}
