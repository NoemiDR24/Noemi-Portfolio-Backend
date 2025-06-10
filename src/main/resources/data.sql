
INSERT INTO project (title, description, image_url, demo_url, repo_url, technologies)
VALUES
  (
    'Blend-r',
    'A full-stack app to create and join events with people who share similar interests. Includes authentication, event management, and user profiles.',
    '/images/blend-r.png',
    '',
    '',
    'React, Java, Spring Boot, PostgreSQL, Vite, CSS'
  ),
  (
    'TEnmo',
    'A command-line application that allows users to send and request virtual money ("TE Bucks") from other users. Includes authentication, secure transactions, and a RESTful API.',
    '/images/tenmo.png',
    '',
    '',
    'Java, Spring Boot, PostgreSQL, JDBC, REST API'
  ),
  (
    'Vendo-Matic 800',
    'A console-based application that simulates a vending machine. Supports product selection, transaction logging, change return, and file-based inventory loading.',
    '/images/vendo-matic.png',
    '',
    '',
    'Java, Object-Oriented Programming, File I/O'
  ),
  (
    'Number Converter',
    'A tool to convert between binary, hexadecimal, octal, decimal, and Roman numerals.',
    '/images/converter.png',
    '',
    '',
    'Java'
  )
--  (
--    'Tortilla Sales App',
--    'An application to manage orders, rewards, and regular customers for a tortilla business.',
--    '/images/tortillas.png',
--    'https://tortillas-demo.com',
--    'https://github.com/noemidr/tortilla-app',
--    'Java, Spring Boot, PostgreSQL, React, HTML, CSS'
--  )

  ON CONFLICT (title) DO NOTHING;