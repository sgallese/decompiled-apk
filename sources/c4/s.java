package c4;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    public View f8831b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f8830a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<l> f8832c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f8831b == sVar.f8831b && this.f8830a.equals(sVar.f8830a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8831b.hashCode() * 31) + this.f8830a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f8831b + "\n") + "    values:";
        for (String str2 : this.f8830a.keySet()) {
            str = str + "    " + str2 + ": " + this.f8830a.get(str2) + "\n";
        }
        return str;
    }

    public s(View view) {
        this.f8831b = view;
    }
}
