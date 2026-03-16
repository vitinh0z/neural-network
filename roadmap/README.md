# 🗺️ ML Backend — Map of Content

> Trilha de estudos partindo do neural-network (1 neurônio em Java) até ML Engineering com Spring Boot.
> Foco total em backend — sem frontend.

---

## Trilha principal

```
Fase 0   → Matemática essencial          (1 semana, paralela)
Fase 1   → Training history + métricas   (1–2 semanas)
Fase 2   → Regressão N features          (2 semanas)
Fase 3   → Classificação binária         (2 semanas)
Fase 3.5 → Classificação multiclasse     (1–2 semanas)
Fase 4   → MLP + Backpropagation         (3 semanas)
Fase 4.5 → Regularização essencial       (1–2 semanas)
Fase 5   → Persistência + experimentos   (1–2 semanas)
Fase 6   → API REST + testes             (1 semana)
Fase 7   → Streaming em tempo real       (2 semanas)
```

## Nível intermediário

```
→ K-Fold cross-validation
→ Busca de hiperparâmetros
→ Feature engineering
→ Batch normalization
```

## Nível avançado

```
→ Embeddings
→ Mecanismo de atenção
→ Modelos em produção (MLOps)
```

## Bônus (otimizadores)

```
→ Mini-batch gradient descent
→ Momentum
→ Adam optimizer
→ Learning rate schedule
```

---

## Fases — trilha principal

| Fase | Pasta | Duração | Status |
|------|-------|---------|--------|
| 0 | [fase-0-matematica](fase-0-matematica/) | 1 semana | ⬜ |
| 1 | [fase-1-training-history](fase-1-training-history/) | 1–2 semanas | ⬜ |
| 2 | [fase-2-regressao](fase-2-regressao/) | 2 semanas | ⬜ |
| 3 | [fase-3-classificacao](fase-3-classificacao/) | 2 semanas | ⬜ |
| 3.5 | [fase-3.5-multiclasse](fase-3.5-multiclasse/) | 1–2 semanas | ⬜ |
| 4 | [fase-4-mlp-backprop](fase-4-mlp-backprop/) | 3 semanas | ⬜ |
| 4.5 | [fase-4.5-regularizacao](fase-4.5-regularizacao/) | 1–2 semanas | ⬜ |
| 5 | [fase-5-experimentos](fase-5-experimentos/) | 1–2 semanas | ⬜ |
| 6 | [fase-6-api-rest](fase-6-api-rest/) | 1 semana | ⬜ |
| 7 | [fase-7-streaming](fase-7-streaming/) | 2 semanas | ⬜ |

## Nível intermediário

| Pasta | Pré-requisito |
|-------|--------------|
| [kfold](intermediario/kfold/) | fase-2-regressao |
| [hiperparam](intermediario/hiperparam/) | kfold |
| [feature-engineering](intermediario/feature-engineering/) | fase-2-regressao |
| [batch-norm](intermediario/batch-norm/) | fase-4.5-regularizacao |

## Nível avançado

| Pasta | Pré-requisito |
|-------|--------------|
| [embeddings](avancado/embeddings/) | fase-4-mlp-backprop + feature-engineering |
| [atencao](avancado/atencao/) | embeddings |
| [producao](avancado/producao/) | fase-7-streaming + fase-5-experimentos |

---

## Progresso geral

### Trilha principal
- [ ] [fase-0-matematica](fase-0-matematica/) — Matemática essencial
- [ ] [fase-1-training-history](fase-1-training-history/) — Training History + métricas
- [ ] [fase-2-regressao](fase-2-regressao/) — Regressão N features
- [ ] [fase-3-classificacao](fase-3-classificacao/) — Classificação binária
- [ ] [fase-3.5-multiclasse](fase-3.5-multiclasse/) — Classificação multiclasse
- [ ] [fase-4-mlp-backprop](fase-4-mlp-backprop/) — MLP + Backpropagation
- [ ] [fase-4.5-regularizacao](fase-4.5-regularizacao/) — Regularização essencial
- [ ] [fase-5-experimentos](fase-5-experimentos/) — Persistência + experimentos
- [ ] [fase-6-api-rest](fase-6-api-rest/) — API REST + testes
- [ ] [fase-7-streaming](fase-7-streaming/) — Streaming em tempo real

### Intermediário
- [ ] [kfold](intermediario/kfold/) — K-Fold cross-validation
- [ ] [hiperparam](intermediario/hiperparam/) — Busca de hiperparâmetros
- [ ] [feature-engineering](intermediario/feature-engineering/) — Feature engineering
- [ ] [batch-norm](intermediario/batch-norm/) — Batch normalization

### Avançado
- [ ] [embeddings](avancado/embeddings/) — Embeddings
- [ ] [atencao](avancado/atencao/) — Mecanismo de atenção
- [ ] [producao](avancado/producao/) — Modelos em produção

### Bônus — Otimizadores
- [ ] [bonus-otimizadores](bonus-otimizadores/) — Mini-batch, Momentum, Adam, Learning rate schedule

---

## Recursos recomendados

- **StatQuest** — intuição de ML
- **micrograd do Karpathy** — backpropagation do zero

## Repositório

- `neural-network` — ponto de partida (repo atual)
- Próximo repo sugerido: `ml-backend` (Spring Boot)
