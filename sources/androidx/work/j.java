package androidx.work;

import java.util.List;

/* compiled from: InputMerger.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7593a = l.f("InputMerger");

    public static j a(String str) {
        try {
            return (j) Class.forName(str).newInstance();
        } catch (Exception e10) {
            l.c().b(f7593a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
