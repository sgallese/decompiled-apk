package nc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import qc.q;
import yc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
/* loaded from: classes4.dex */
public class g extends f {
    public static String c(File file) {
        String J0;
        q.i(file, "<this>");
        String name = file.getName();
        q.h(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        J0 = w.J0(name, '.', "");
        return J0;
    }

    public static String d(File file) {
        String S0;
        q.i(file, "<this>");
        String name = file.getName();
        q.h(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        S0 = w.S0(name, ".", null, 2, null);
        return S0;
    }

    public static final File e(File file, File file2) {
        boolean z10;
        boolean N;
        q.i(file, "<this>");
        q.i(file2, "relative");
        if (d.b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        q.h(file3, "this.toString()");
        if (file3.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            N = w.N(file3, File.separatorChar, false, 2, null);
            if (!N) {
                return new File(file3 + File.separatorChar + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static File f(File file, String str) {
        q.i(file, "<this>");
        q.i(str, "relative");
        return e(file, new File(str));
    }
}
