package f;

import android.content.Context;
import android.content.Intent;
import f.a;
import qc.q;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    @Override // f.a
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        q.i(context, "context");
        q.i(str, "input");
        return b.f14302a.a(new String[]{str});
    }

    @Override // f.a
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public a.C0343a<Boolean> b(Context context, String str) {
        boolean z10;
        q.i(context, "context");
        q.i(str, "input");
        if (androidx.core.content.a.a(context, str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0343a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // f.a
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public Boolean c(int i10, Intent intent) {
        boolean z10;
        boolean z11;
        if (intent != null && i10 == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z12 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (intArrayExtra[i11] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    z12 = true;
                }
            }
            return Boolean.valueOf(z12);
        }
        return Boolean.FALSE;
    }
}
