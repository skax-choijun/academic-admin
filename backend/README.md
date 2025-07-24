# Academic Admin Backend

입학관리 시스템 백엔드(Spring Boot, MyBatis, PostgreSQL) 프로젝트입니다.

---

## 1. 프로젝트 개요
- 대학 입학관리 업무(지원자, 성적, 평가 등) 통합 관리
- Spring Boot 3.4.7, Java 21, MyBatis, PostgreSQL 기반
- RESTful API 제공

---

## 2. 폴더 구조
```
backend/
├─ build.gradle                # Gradle 빌드 설정
├─ settings.gradle             # Gradle 프로젝트 설정
├─ README.md                   # 백엔드 안내 문서
├─ src/
│   └─ main/
│       ├─ java/
│       │   └─ com/skax/academic/
│       │         ├─ domain/      # 엔티티 클래스
│       │         ├─ repository/  # MyBatis 매퍼 인터페이스
│       │         ├─ service/     # 서비스(비즈니스 로직)
│       │         └─ controller/  # REST API 컨트롤러
│       └─ resources/
│             ├─ application.yml  # 환경설정
│             └─ mapper/          # MyBatis 매퍼 XML
└─ static/                       # 정적 리소스(예비)
```

---

## 3. 주요 도메인/기능
- **Applicant**: 지원자 정보 관리
- **Score**: 성적(학생부, 수능 등) 관리
- **Evaluation**: 평가 항목/가중치/점수 관리
- (확장 가능: 출력 이력, 로그 등)

---

## 4. DB 테이블 생성 예시 (PostgreSQL)
```sql
CREATE TABLE applicant (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(30),
    apply_type VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE score (
    id SERIAL PRIMARY KEY,
    applicant_id INTEGER REFERENCES applicant(id),
    type VARCHAR(30),
    value NUMERIC(5,2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE evaluation (
    id SERIAL PRIMARY KEY,
    applicant_id INTEGER REFERENCES applicant(id),
    item VARCHAR(50),
    weight NUMERIC(3,2),
    score NUMERIC(5,2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## 5. 실행 방법
1. **의존성 설치**
   - 프로젝트 루트에서: `cd backend`
   - Gradle 빌드: `./gradlew build` (윈도우: `gradlew.bat build`)
2. **DB 준비**
   - PostgreSQL에 위 테이블 생성
   - `src/main/resources/application.yml`에서 DB 접속 정보 수정
3. **서버 실행**
   - `./gradlew bootRun` (윈도우: `gradlew.bat bootRun`)
   - 기본 포트: 8080
4. **API 테스트**
   - 예시: `GET http://localhost:8080/api/applicants`
   - Postman, curl 등으로 CRUD 테스트 가능

---

## 6. 주요 API 예시
- `GET /api/applicants` : 지원자 전체 조회
- `POST /api/applicants` : 지원자 등록
- `GET /api/scores/applicant/{applicantId}` : 지원자별 성적 조회
- `GET /api/evaluations/applicant/{applicantId}` : 지원자별 평가 조회

---

## 7. 확장/운영 안내
- 추가 도메인(출력 이력, 로그 등) 및 보안/인증 기능 확장 가능
- Docker, Kubernetes, CI/CD(GitHub Actions) 등 운영 환경 연동 가능
- 프론트엔드(React 등)와 REST API로 연동

---

## 8. 문의/기여
- 요구사항/버그/기여는 담당자 또는 이슈 트래커를 통해 문의해 주세요. 