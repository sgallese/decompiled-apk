package com.habitrpg.android.habitica.utils;

import com.google.firebase.perf.metrics.Trace;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import ec.t;
import io.realm.o0;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import qc.q;
import s9.e;

/* compiled from: TaskListDeserializer.kt */
/* loaded from: classes4.dex */
public final class TaskListDeserializer implements k<TaskList> {
    public static final int $stable = 0;

    private final boolean alreadyContainsTag(List<? extends Tag> list, String str) {
        Iterator<? extends Tag> it = list.iterator();
        while (it.hasNext()) {
            if (q.d(it.next().getId(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final x0<Tag> handleTags(List<? extends Tag> list, i iVar, j jVar) {
        Iterable i10;
        x0<Tag> x0Var = new x0<>();
        Iterable iterable = iVar;
        if (iVar == null) {
            i10 = t.i();
            iterable = i10;
        }
        for (l lVar : iterable) {
            if (lVar.o()) {
                x0Var.add(jVar.a(lVar, Tag.class));
            } else {
                try {
                    String l10 = lVar.l();
                    Iterator<? extends Tag> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Tag next = it.next();
                            if (q.d(next.getId(), l10)) {
                                q.f(l10);
                                if (!alreadyContainsTag(x0Var, l10)) {
                                    x0Var.add(next);
                                }
                            }
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        return x0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public TaskList deserialize(l lVar, Type type, j jVar) {
        List<? extends Tag> arrayList;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "ctx");
        TaskList taskList = new TaskList();
        HashMap hashMap = new HashMap();
        Trace e10 = e.c().e("TaskListDeserialize");
        q.h(e10, "newTrace(...)");
        e10.start();
        try {
            o0 Z0 = o0.Z0();
            arrayList = Z0.z0(Z0.k1(Tag.class).p());
            q.h(arrayList, "copyFromRealm(...)");
            Z0.close();
        } catch (RuntimeException unused) {
            arrayList = new ArrayList<>();
        }
        Iterator<l> it = lVar.h().iterator();
        while (it.hasNext()) {
            l next = it.next();
            try {
                n nVar = next instanceof n ? (n) next : null;
                if (nVar != null) {
                    Task task = (Task) jVar.a(nVar, Task.class);
                    task.setTags(handleTags(arrayList, nVar.y("tags"), jVar));
                    String id2 = task.getId();
                    if (id2 != null) {
                        q.f(task);
                        hashMap.put(id2, task);
                    }
                }
            } catch (ClassCastException | UnsupportedOperationException unused2) {
            }
        }
        taskList.setTasks(hashMap);
        e10.stop();
        return taskList;
    }
}
