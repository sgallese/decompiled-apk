package xa;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.y0;
import java.util.Set;
import wa.f;

/* compiled from: DefaultViewModelFactories.java */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DefaultViewModelFactories.java */
    /* renamed from: xa.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0588a {
        c getHiltInternalFactoryFactory();
    }

    /* compiled from: DefaultViewModelFactories.java */
    /* loaded from: classes4.dex */
    public interface b {
        c getHiltInternalFactoryFactory();
    }

    /* compiled from: DefaultViewModelFactories.java */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f25886a;

        /* renamed from: b  reason: collision with root package name */
        private final f f25887b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Set<String> set, f fVar) {
            this.f25886a = set;
            this.f25887b = fVar;
        }

        private y0.b c(y0.b bVar) {
            return new d(this.f25886a, (y0.b) ab.d.b(bVar), this.f25887b);
        }

        y0.b a(ComponentActivity componentActivity, y0.b bVar) {
            return c(bVar);
        }

        y0.b b(Fragment fragment, y0.b bVar) {
            return c(bVar);
        }
    }

    public static y0.b a(ComponentActivity componentActivity, y0.b bVar) {
        return ((InterfaceC0588a) ra.a.a(componentActivity, InterfaceC0588a.class)).getHiltInternalFactoryFactory().a(componentActivity, bVar);
    }

    public static y0.b b(Fragment fragment, y0.b bVar) {
        return ((b) ra.a.a(fragment, b.class)).getHiltInternalFactoryFactory().b(fragment, bVar);
    }
}
