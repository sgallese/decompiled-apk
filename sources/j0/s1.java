package j0;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f18896a;

    public s1(List<Integer> list) {
        qc.q.i(list, "list");
        this.f18896a = list;
    }

    public final void a(int i10) {
        if ((!this.f18896a.isEmpty()) != false) {
            if (this.f18896a.get(0).intValue() != i10) {
                if (this.f18896a.get(r0.size() - 1).intValue() == i10) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f18896a.size();
        this.f18896a.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int intValue = this.f18896a.get(i11).intValue();
            if (i10 <= intValue) {
                break;
            }
            this.f18896a.set(size, Integer.valueOf(intValue));
            size = i11;
        }
        this.f18896a.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return !this.f18896a.isEmpty();
    }

    public final int c() {
        Object a02;
        a02 = ec.b0.a0(this.f18896a);
        return ((Number) a02).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d() {
        boolean z10;
        Object m02;
        int intValue;
        if (this.f18896a.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int intValue2 = this.f18896a.get(0).intValue();
            while ((!this.f18896a.isEmpty()) != false && this.f18896a.get(0).intValue() == intValue2) {
                List<Integer> list = this.f18896a;
                m02 = ec.b0.m0(list);
                list.set(0, m02);
                List<Integer> list2 = this.f18896a;
                list2.remove(list2.size() - 1);
                int size = this.f18896a.size();
                int size2 = this.f18896a.size() >>> 1;
                int i10 = 0;
                while (i10 < size2) {
                    int intValue3 = this.f18896a.get(i10).intValue();
                    int i11 = (i10 + 1) * 2;
                    int i12 = i11 - 1;
                    int intValue4 = this.f18896a.get(i12).intValue();
                    if (i11 < size && (intValue = this.f18896a.get(i11).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            this.f18896a.set(i10, Integer.valueOf(intValue));
                            this.f18896a.set(i11, Integer.valueOf(intValue3));
                            i10 = i11;
                        }
                    } else if (intValue4 > intValue3) {
                        this.f18896a.set(i10, Integer.valueOf(intValue4));
                        this.f18896a.set(i12, Integer.valueOf(intValue3));
                        i10 = i12;
                    }
                }
            }
            return intValue2;
        }
        n.w("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ s1(List list, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
