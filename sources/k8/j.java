package k8;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: ComponentRegistrarProcessor.java */
/* loaded from: classes3.dex */
public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f19393a = new j() { // from class: k8.i
        @Override // k8.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<c<?>> a(ComponentRegistrar componentRegistrar);
}
