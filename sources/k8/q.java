package k8;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes3.dex */
class q {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final k8.c<?> f19413a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f19414b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f19415c = new HashSet();

        b(k8.c<?> cVar) {
            this.f19413a = cVar;
        }

        void a(b bVar) {
            this.f19414b.add(bVar);
        }

        void b(b bVar) {
            this.f19415c.add(bVar);
        }

        k8.c<?> c() {
            return this.f19413a;
        }

        Set<b> d() {
            return this.f19414b;
        }

        boolean e() {
            return this.f19414b.isEmpty();
        }

        boolean f() {
            return this.f19415c.isEmpty();
        }

        void g(b bVar) {
            this.f19415c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final b0<?> f19416a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f19417b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f19416a.equals(this.f19416a) || cVar.f19417b != this.f19417b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f19416a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f19417b).hashCode();
        }

        private c(b0<?> b0Var, boolean z10) {
            this.f19416a = b0Var;
            this.f19417b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<k8.c<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b10.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c10) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<k8.c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<k8.c<?>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                k8.c<?> next = it.next();
                b bVar = new b(next);
                for (b0<? super Object> b0Var : next.j()) {
                    c cVar = new c(b0Var, !next.p());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (!set2.isEmpty() && !cVar.f19417b) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", b0Var));
                    }
                    set2.add(bVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar2 : (Set) it2.next()) {
                        for (r rVar : bVar2.c().g()) {
                            if (rVar.e() && (set = (Set) hashMap.get(new c(rVar.c(), rVar.g()))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.a(bVar3);
                                    bVar3.b(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }
}
