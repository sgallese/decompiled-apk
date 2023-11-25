package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f652a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f653b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f654c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f655d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f656e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f657f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f658g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f659h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends androidx.activity.result.b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a f665b;

        a(String str, f.a aVar) {
            this.f664a = str;
            this.f665b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, androidx.core.app.d dVar) {
            Integer num = ActivityResultRegistry.this.f654c.get(this.f664a);
            if (num != null) {
                ActivityResultRegistry.this.f656e.add(this.f664a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f665b, i10, dVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f656e.remove(this.f664a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f665b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f664a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    class b<I> extends androidx.activity.result.b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a f668b;

        b(String str, f.a aVar) {
            this.f667a = str;
            this.f668b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, androidx.core.app.d dVar) {
            Integer num = ActivityResultRegistry.this.f654c.get(this.f667a);
            if (num != null) {
                ActivityResultRegistry.this.f656e.add(this.f667a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f668b, i10, dVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f656e.remove(this.f667a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f668b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f667a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final androidx.activity.result.a<O> f670a;

        /* renamed from: b  reason: collision with root package name */
        final f.a<?, O> f671b;

        c(androidx.activity.result.a<O> aVar, f.a<?, O> aVar2) {
            this.f670a = aVar;
            this.f671b = aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final p f672a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<s> f673b = new ArrayList<>();

        d(p pVar) {
            this.f672a = pVar;
        }

        void a(s sVar) {
            this.f672a.a(sVar);
            this.f673b.add(sVar);
        }

        void b() {
            Iterator<s> it = this.f673b.iterator();
            while (it.hasNext()) {
                this.f672a.d(it.next());
            }
            this.f673b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f653b.put(Integer.valueOf(i10), str);
        this.f654c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar != null && cVar.f670a != null && this.f656e.contains(str)) {
            cVar.f670a.a(cVar.f671b.c(i10, intent));
            this.f656e.remove(str);
            return;
        }
        this.f658g.remove(str);
        this.f659h.putParcelable(str, new ActivityResult(i10, intent));
    }

    private int e() {
        int nextInt = this.f652a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (this.f653b.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f652a.nextInt(2147418112);
            } else {
                return i10;
            }
        }
    }

    private void k(String str) {
        if (this.f654c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f653b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f657f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        androidx.activity.result.a<?> aVar;
        String str = this.f653b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f657f.get(str);
        if (cVar != null && (aVar = cVar.f670a) != null) {
            if (this.f656e.remove(str)) {
                aVar.a(o10);
                return true;
            }
            return true;
        }
        this.f659h.remove(str);
        this.f658g.put(str, o10);
        return true;
    }

    public abstract <I, O> void f(int i10, f.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, androidx.core.app.d dVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.f656e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.f652a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.f659h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                String str = stringArrayList.get(i10);
                if (this.f654c.containsKey(str)) {
                    Integer remove = this.f654c.remove(str);
                    if (!this.f659h.containsKey(str)) {
                        this.f653b.remove(remove);
                    }
                }
                a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f654c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f654c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f656e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f659h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f652a);
    }

    public final <I, O> androidx.activity.result.b<I> i(final String str, v vVar, final f.a<I, O> aVar, final androidx.activity.result.a<O> aVar2) {
        p lifecycle = vVar.getLifecycle();
        if (!lifecycle.b().isAtLeast(p.b.STARTED)) {
            k(str);
            d dVar = this.f655d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new s() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.s
                public void c(v vVar2, p.a aVar3) {
                    if (p.a.ON_START.equals(aVar3)) {
                        ActivityResultRegistry.this.f657f.put(str, new c<>(aVar2, aVar));
                        if (ActivityResultRegistry.this.f658g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f658g.get(str);
                            ActivityResultRegistry.this.f658g.remove(str);
                            aVar2.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f659h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f659h.remove(str);
                            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
                        }
                    } else if (p.a.ON_STOP.equals(aVar3)) {
                        ActivityResultRegistry.this.f657f.remove(str);
                    } else if (p.a.ON_DESTROY.equals(aVar3)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f655d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + vVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.b<I> j(String str, f.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        k(str);
        this.f657f.put(str, new c<>(aVar2, aVar));
        if (this.f658g.containsKey(str)) {
            Object obj = this.f658g.get(str);
            this.f658g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f659h.getParcelable(str);
        if (activityResult != null) {
            this.f659h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer remove;
        if (!this.f656e.contains(str) && (remove = this.f654c.remove(str)) != null) {
            this.f653b.remove(remove);
        }
        this.f657f.remove(str);
        if (this.f658g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f658g.get(str));
            this.f658g.remove(str);
        }
        if (this.f659h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f659h.getParcelable(str));
            this.f659h.remove(str);
        }
        d dVar = this.f655d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f655d.remove(str);
        }
    }
}
