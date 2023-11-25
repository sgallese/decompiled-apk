package bc;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.a1;
import io.realm.n;
import io.realm.o0;
import io.realm.p;

/* compiled from: RxObservableFactory.java */
/* loaded from: classes4.dex */
public interface c {
    <E extends a1> Flowable<E> a(o0 o0Var, E e10);

    Flowable<p> b(n nVar, p pVar);

    Observable<a<p>> c(n nVar, p pVar);

    <E extends a1> Observable<a<E>> d(o0 o0Var, E e10);
}
