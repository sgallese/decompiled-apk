package qc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SpreadBuilder.java */
/* loaded from: classes4.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Object> f21681a;

    public i0(int i10) {
        this.f21681a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f21681a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f21681a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f21681a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f21681a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f21681a.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f21681a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f21681a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f21681a.toArray(objArr);
    }
}
