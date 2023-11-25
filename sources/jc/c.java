package jc;

import ec.p;
import java.io.Serializable;
import java.lang.Enum;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnumEntries.kt */
/* loaded from: classes4.dex */
public final class c<T extends Enum<T>> extends ec.c<T> implements a<T>, Serializable {

    /* renamed from: m  reason: collision with root package name */
    private final T[] f19087m;

    public c(T[] tArr) {
        q.i(tArr, "entries");
        this.f19087m = tArr;
    }

    @Override // ec.a
    public int a() {
        return this.f19087m.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return e((Enum) obj);
    }

    public boolean e(T t10) {
        Object Q;
        q.i(t10, "element");
        Q = p.Q(this.f19087m, t10.ordinal());
        if (((Enum) Q) == t10) {
            return true;
        }
        return false;
    }

    @Override // ec.c, java.util.List
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        ec.c.f14163f.b(i10, this.f19087m.length);
        return this.f19087m[i10];
    }

    public int h(T t10) {
        Object Q;
        q.i(t10, "element");
        int ordinal = t10.ordinal();
        Q = p.Q(this.f19087m, ordinal);
        if (((Enum) Q) != t10) {
            return -1;
        }
        return ordinal;
    }

    public int i(T t10) {
        q.i(t10, "element");
        return indexOf(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return h((Enum) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return i((Enum) obj);
    }
}
