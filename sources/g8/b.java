package g8;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import i8.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final i9.b<i8.a> f16241a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16242b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f16243c = null;

    public b(Context context, i9.b<i8.a> bVar, String str) {
        this.f16241a = bVar;
        this.f16242b = str;
    }

    private void a(a.c cVar) {
        this.f16241a.get().f(cVar);
    }

    private void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        for (a aVar : list) {
            while (arrayDeque.size() >= i10) {
                k(((a.c) arrayDeque.pollFirst()).f17103b);
            }
            a.c f10 = aVar.f(this.f16242b);
            a(f10);
            arrayDeque.offer(f10);
        }
    }

    private static List<a> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.b(it.next()));
        }
        return arrayList;
    }

    private boolean d(List<a> list, a aVar) {
        String c10 = aVar.c();
        String e10 = aVar.e();
        for (a aVar2 : list) {
            if (aVar2.c().equals(c10) && aVar2.e().equals(e10)) {
                return true;
            }
        }
        return false;
    }

    private List<a.c> f() {
        return this.f16241a.get().e(this.f16242b, "");
    }

    private ArrayList<a> g(List<a> list, List<a> list2) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<a> list, List<a> list2) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar.f(this.f16242b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f16243c == null) {
            this.f16243c = Integer.valueOf(this.f16241a.get().d(this.f16242b));
        }
        return this.f16243c.intValue();
    }

    private void k(String str) {
        this.f16241a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f17103b);
        }
    }

    private void n(List<a> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<a> e10 = e();
        l(h(e10, list));
        b(g(list, e10));
    }

    private void o() throws AbtException {
        if (this.f16241a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    public List<a> e() throws AbtException {
        o();
        List<a.c> f10 = f();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = f10.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        return arrayList;
    }

    public void j() throws AbtException {
        o();
        l(f());
    }

    public void m(List<Map<String, String>> list) throws AbtException {
        o();
        if (list != null) {
            n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
