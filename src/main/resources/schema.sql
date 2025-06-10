CREATE TABLE IF NOT EXISTS project (
  id SERIAL PRIMARY KEY,
  title VARCHAR(255) NOT NULL UNIQUE,
  description TEXT,
  image_url TEXT,
  demo_url TEXT,
  repo_url TEXT,
  technologies TEXT
);

CREATE TABLE IF NOT EXISTS message (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(150) NOT NULL,
  message TEXT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
