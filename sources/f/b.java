package f;

import android.content.Context;
import android.content.Intent;
import dc.r;
import ec.b0;
import ec.m0;
import ec.n0;
import ec.p;
import f.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qc.h;
import qc.q;
import vc.l;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class b extends f.a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14302a = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            q.i(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            q.h(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // f.a
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        q.i(context, "context");
        q.i(strArr, "input");
        return f14302a.a(strArr);
    }

    @Override // f.a
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public a.C0343a<Map<String, Boolean>> b(Context context, String[] strArr) {
        boolean z10;
        int d10;
        int d11;
        boolean z11;
        Map h10;
        q.i(context, "context");
        q.i(strArr, "input");
        boolean z12 = true;
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h10 = n0.h();
            return new a.C0343a<>(h10);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (androidx.core.content.a.a(context, strArr[i10]) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
                break;
            }
            i10++;
        }
        if (z12) {
            d10 = m0.d(strArr.length);
            d11 = l.d(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (String str : strArr) {
                dc.l a10 = r.a(str, Boolean.TRUE);
                linkedHashMap.put(a10.c(), a10.d());
            }
            return new a.C0343a<>(linkedHashMap);
        }
        return null;
    }

    @Override // f.a
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> c(int i10, Intent intent) {
        Map<String, Boolean> h10;
        List J;
        List J0;
        Map<String, Boolean> p10;
        boolean z10;
        Map<String, Boolean> h11;
        Map<String, Boolean> h12;
        if (i10 != -1) {
            h12 = n0.h();
            return h12;
        } else if (intent == null) {
            h11 = n0.h();
            return h11;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                h10 = n0.h();
                return h10;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(Boolean.valueOf(z10));
            }
            J = p.J(stringArrayExtra);
            J0 = b0.J0(J, arrayList);
            p10 = n0.p(J0);
            return p10;
        }
    }
}
