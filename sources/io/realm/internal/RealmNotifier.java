package io.realm.internal;

import io.realm.internal.j;
import io.realm.u0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: classes4.dex */
public abstract class RealmNotifier implements Closeable {
    private OsSharedRealm sharedRealm;
    private j<b> realmObserverPairs = new j<>();
    private final j.a<b> onChangeCallBack = new a();
    private List<Runnable> transactionCallbacks = new ArrayList();
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();

    /* loaded from: classes4.dex */
    class a implements j.a<b> {
        a() {
        }

        @Override // io.realm.internal.j.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b bVar, Object obj) {
            if (RealmNotifier.this.sharedRealm != null && !RealmNotifier.this.sharedRealm.isClosed()) {
                bVar.b(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b<T> extends j.b<T, u0<T>> {
        b(T t10, u0<T> u0Var) {
            super(t10, u0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(T t10) {
            if (t10 != null) {
                ((u0) this.f17820b).a(t10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RealmNotifier(OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.b();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public <T> void addChangeListener(T t10, u0<T> u0Var) {
        this.realmObserverPairs.a(new b(t10, u0Var));
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    void didChange() {
        this.realmObserverPairs.c(this.onChangeCallBack);
        if (!this.transactionCallbacks.isEmpty()) {
            List<Runnable> list = this.transactionCallbacks;
            this.transactionCallbacks = new ArrayList();
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    void didSendNotifications() {
        for (int i10 = 0; i10 < this.startSendingNotificationsCallbacks.size(); i10++) {
            this.finishedSendingNotificationsCallbacks.get(i10).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.g();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e10, u0<E> u0Var) {
        this.realmObserverPairs.e(e10, u0Var);
    }

    public <E> void removeChangeListeners(E e10) {
        this.realmObserverPairs.f(e10);
    }

    void willSendNotifications() {
        for (int i10 = 0; i10 < this.startSendingNotificationsCallbacks.size(); i10++) {
            this.startSendingNotificationsCallbacks.get(i10).run();
        }
    }
}
